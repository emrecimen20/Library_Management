package com.emre.Library_Management.business.abstracts;

import com.emre.Library_Management.entity.Book;

import java.util.List;

public interface IBookService {

    void save(Book book);

    List<Book> get();

    Book getById(int id);

    void delete(int id);

}
