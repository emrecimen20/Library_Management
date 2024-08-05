package com.emre.Library_Management.dto.request;

import com.emre.Library_Management.entity.Book;

import java.util.List;

public class PublisherSaveRequest {

    private String name;
    private int establishmentYear;
    private String address;
    private List<Book> bookList;

    public PublisherSaveRequest() {

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
