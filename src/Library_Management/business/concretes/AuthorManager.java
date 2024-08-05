package com.emre.Library_Management.business.concretes;

import com.emre.Library_Management.business.abstracts.IAuthorService;
import com.emre.Library_Management.core.exception.NotFoundException;
import com.emre.Library_Management.core.utilies.Msg;
import com.emre.Library_Management.dao.AuthorRepo;
import com.emre.Library_Management.entity.Author;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorManager implements IAuthorService {

    private final AuthorRepo authorRepo;

    public AuthorManager(AuthorRepo authorRepo) {
        this.authorRepo = authorRepo;
    }

    @Override
    public void save(Author author) {
        this.authorRepo.save(author);
    }

    @Override
    public List<Author> get() {
        return this.authorRepo.findAll();
    }

    @Override
    public Author getById(int id) {
        return this.authorRepo.findById(id).orElseThrow(
                ()-> new NotFoundException(Msg.NOT_FOUND)
        );
    }

    @Override
    public void delete(int id) {
        Author author = this.getById(id);
        this.authorRepo.delete(author);
    }

}
