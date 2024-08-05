package com.emre.Library_Management.business.abstracts;

import com.emre.Library_Management.entity.Publisher;

import java.util.List;

public interface IPublisherService {

    void save(Publisher publisher);

    List<Publisher> get();

    Publisher getById(int id);

    void delete(int id);

}
