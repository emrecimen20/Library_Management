package com.emre.Library_Management.dto.request;

import com.emre.Library_Management.entity.Book;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.List;

public class AuthorSaveRequest {

    @NotBlank(message = "Name can not be null or empty")
    private String name;
    @NotNull(message = "BirthDate can not be null or empty")
    @Min(value = 1900, message = "BirthDate should not be before 1900")
    @Max(value = 2024, message = "BirthDate should not be after 2024")
    private Integer birthDate;
    @NotBlank(message = "Country can not be null or empty")
    private String country;
    private List<Book> bookList;

    public AuthorSaveRequest() {

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
