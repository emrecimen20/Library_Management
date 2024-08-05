package com.emre.Library_Management.business.concretes;

import com.emre.Library_Management.business.abstracts.IPublisherService;
import com.emre.Library_Management.core.exception.NotFoundException;
import com.emre.Library_Management.core.utilies.Msg;
import com.emre.Library_Management.dao.PublisherRepo;
import com.emre.Library_Management.entity.Publisher;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublisherManager implements IPublisherService {

    private final PublisherRepo publisherRepo;

    public PublisherManager(PublisherRepo publisherRepo) {
        this.publisherRepo = publisherRepo;
    }

    @Override
    public void save(Publisher publisher) {
        this.publisherRepo.save(publisher);
    }

    @Override
    public List<Publisher> get() {
        return this.publisherRepo.findAll();
    }

    @Override
    public Publisher getById(int id) {
        return this.publisherRepo.findById(id).orElseThrow(
                ()->new NotFoundException(Msg.NOT_FOUND)
        );
    }

    @Override
    public void delete(int id) {
        Publisher deletedPublisher = this.getById(id);
        this.publisherRepo.delete(deletedPublisher);
    }
}

