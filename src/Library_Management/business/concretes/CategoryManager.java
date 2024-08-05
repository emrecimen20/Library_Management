package com.emre.Library_Management.business.concretes;

import com.emre.Library_Management.business.abstracts.ICategoryService;
import com.emre.Library_Management.core.exception.NotFoundException;
import com.emre.Library_Management.core.utilies.Msg;
import com.emre.Library_Management.dao.CategoryRepo;
import com.emre.Library_Management.entity.Category;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryManager implements ICategoryService {

    private final CategoryRepo categoryRepo;

    public CategoryManager(CategoryRepo categoryRepo) {
        this.categoryRepo = categoryRepo;
    }

    @Override
    public void save(Category category) {
        this.categoryRepo.save(category);
    }

    @Override
    public List<Category> get() {
        return this.categoryRepo.findAll();
    }

    @Override
    public Category getById(int id) {
        return this.categoryRepo.findById(id).orElseThrow(
                ()->new NotFoundException(Msg.NOT_FOUND)
        );
    }

    @Override
    public void delete(int id) {
        Category deletedCategory = this.getById(id);
        this.categoryRepo.delete(deletedCategory);
    }

}
