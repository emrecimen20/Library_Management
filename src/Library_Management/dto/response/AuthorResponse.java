package com.emre.Library_Management.dto.response;

import com.emre.Library_Management.entity.Book;

import java.util.List;

public class AuthorResponse {

    private int id;
    private String name;
    private int birthDate;
    private String country;
    private List<Book> bookList;

    public AuthorResponse() {

    }

    public AuthorResponse(int id, String name, int birthDate, String country, List<Book> bookList) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.country = country;
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

    public int getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

}
