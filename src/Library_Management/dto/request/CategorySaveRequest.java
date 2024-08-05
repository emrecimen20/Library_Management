package com.emre.Library_Management.dto.request;

import com.emre.Library_Management.entity.Book;

import java.util.List;

public class CategorySaveRequest {

    private String name;
    private String description;
    private List<Book> bookList;

    public CategorySaveRequest() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

}
