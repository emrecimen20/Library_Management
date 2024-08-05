package com.emre.Library_Management.dto.response;

import com.emre.Library_Management.entity.Author;
import com.emre.Library_Management.entity.BookBorrowing;
import com.emre.Library_Management.entity.Category;
import com.emre.Library_Management.entity.Publisher;

import java.util.List;

public class BookResponse {

    private int id;

    private String name;

    private int publicationYear;

    private int stock;

    private Author author;

    private Publisher publisher;

    private List<BookBorrowing> bookBorrowingList;

    private List<Category> categoryList;

    public BookResponse() {

    }

    public BookResponse(int id, String name, int publicationYear, int stock, Author author, Publisher publisher, List<BookBorrowing> bookBorrowingList, List<Category> categoryList) {
        this.id = id;
        this.name = name;
        this.publicationYear = publicationYear;
        this.stock = stock;
        this.author = author;
        this.publisher = publisher;
        this.bookBorrowingList = bookBorrowingList;
        this.categoryList = categoryList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public List<BookBorrowing> getBookBorrowingList() {
        return bookBorrowingList;
    }

    public void setBookBorrowingList(List<BookBorrowing> bookBorrowingList) {
        this.bookBorrowingList = bookBorrowingList;
    }

    public List<Category> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<Category> categoryList) {
        this.categoryList = categoryList;
    }

}

