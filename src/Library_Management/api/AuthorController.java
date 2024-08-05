package com.emre.Library_Management.api;

import com.emre.Library_Management.business.abstracts.IAuthorService;
import com.emre.Library_Management.core.result.ResultData;
import com.emre.Library_Management.core.utilies.ResultHelper;
import com.emre.Library_Management.dto.request.AuthorSaveRequest;
import com.emre.Library_Management.dto.response.AuthorResponse;
import com.emre.Library_Management.entity.Author;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/authors")
public class AuthorController {

    private final IAuthorService authorService;

    public AuthorController(IAuthorService authorService) {
        this.authorService = authorService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    private ResultData<AuthorResponse> save(@Valid @RequestBody AuthorSaveRequest authorSaveRequest) {

        Author author = new Author(
                authorSaveRequest.getName(),
                authorSaveRequest.getBirthDate(),
                authorSaveRequest.getCountry(),
                authorSaveRequest.getBookList()
        );

        this.authorService.save(author);

        AuthorResponse authorResponse = new AuthorResponse(
                author.getId(),
                author.getName(),
                author.getBirthDate(),
                author.getCountry(),
                author.getBookList()
        );

        return ResultHelper.created(authorResponse);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    private List<Author> get() {
        return this.authorService.get();
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    private ResultData<Author> delete(@PathVariable("id")int id) {
        Author deletedAuthor = this.authorService.getById(id);
        this.authorService.delete(id);
        return ResultHelper.deleted(deletedAuthor);
    }

}
