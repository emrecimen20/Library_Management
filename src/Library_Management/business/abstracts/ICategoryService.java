package com.emre.Library_Management.business.abstracts;

import com.emre.Library_Management.entity.Category;

import java.util.List;

public interface ICategoryService {

    void save(Category category);

    List<Category> get();

    Category getById(int id);

    void delete(int id);

}
