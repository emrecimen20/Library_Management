package com.emre.Library_Management.dto.response;

import com.emre.Library_Management.entity.Book;

import java.util.List;

public class PublisherResponse {

    private int id;
    private String name;
    private int establishmentYear;
    private String address;
    private List<Book> bookList;

    public PublisherResponse() {
    }

    public PublisherResponse(int id, String name, int establishmentYear, String address, List<Book> bookList) {
        this.id = id;
        this.name = name;
        this.establishmentYear = establishmentYear;
        this.address = address;
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

    public int getEstablishmentYear() {
        return establishmentYear;
    }

    public void setEstablishmentYear(int establishmentYear) {
        this.establishmentYear = establishmentYear;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

}
