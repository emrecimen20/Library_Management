package com.emre.Library_Management.business.abstracts;

import com.emre.Library_Management.entity.Author;

import java.util.List;

public interface IAuthorService {

    void save(Author author);

    List<Author> get();

    Author getById(int id);

    void delete(int id);


}
