package com.emre.Library_Management.dto.request;

import com.emre.Library_Management.entity.Author;
import com.emre.Library_Management.entity.BookBorrowing;
import com.emre.Library_Management.entity.Category;
import com.emre.Library_Management.entity.Publisher;

import java.util.List;

public class BookSaveRequest {

    private String name;

    private int publicationYear;

    private int stock;

    private Author author;

    private Publisher publisher;

    private List<BookBorrowing> bookBorrowingList;

    private List<Category> categoryList;

    public BookSaveRequest() {

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

