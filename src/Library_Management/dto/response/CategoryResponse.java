package com.emre.Library_Management.dto.response;

import com.emre.Library_Management.entity.Book;

import java.util.List;

public class CategoryResponse {

    private int id;
    private String name;
    private String description;
    private List<Book> bookList;

    public CategoryResponse() {

    }

    public CategoryResponse(int id, String name, String description, List<Book> bookList) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.bookList = bookList;
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
