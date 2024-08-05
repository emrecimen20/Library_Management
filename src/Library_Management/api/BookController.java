package com.emre.Library_Management.api;

import com.emre.Library_Management.business.abstracts.IAuthorService;
import com.emre.Library_Management.business.abstracts.IBookService;
import com.emre.Library_Management.core.result.ResultData;
import com.emre.Library_Management.core.utilies.ResultHelper;
import com.emre.Library_Management.dto.request.BookSaveRequest;
import com.emre.Library_Management.dto.response.BookResponse;
import com.emre.Library_Management.entity.Author;
import com.emre.Library_Management.entity.Book;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/books")
public class BookController {

    private final IBookService bookService;
    private final IAuthorService authorService;

    public BookController(IBookService bookService, IAuthorService authorService) {
        this.bookService = bookService;
        this.authorService = authorService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    private ResultData<BookResponse> save(@Valid @RequestBody BookSaveRequest bookSaveRequest) {

        Author author = this.authorService.getById(bookSaveRequest.getAuthor().getId());

        authorService.save(author);

        Book book = new Book(
                bookSaveRequest.getName(),
                bookSaveRequest.getPublicationYear(),
                bookSaveRequest.getStock(),
                author,
                bookSaveRequest.getPublisher(),
                bookSaveRequest.getBookBorrowingList(),
                bookSaveRequest.getCategoryList()
        );

        this.bookService.save(book);

        BookResponse bookResponse = new BookResponse(
                book.getId(),
                book.getName(),
                book.getPublicationYear(),
                book.getStock(),
                book.getAuthor(),
                book.getPublisher(),
                book.getBookBorrowingList(),
                book.getCategoryList()
        );

        return ResultHelper.created(bookResponse);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    private List<Book> get() {
        return this.bookService.get();
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    private ResultData<Book> delete(@PathVariable("id")int id) {
        Book deletedBook = this.bookService.getById(id);
        this.bookService.delete(id);
        return ResultHelper.deleted(deletedBook);
    }

}

