package com.emre.Library_Management.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "categories")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id",columnDefinition = "serial")
    private int id;

    @Column(name = "category_name",nullable = false)
    private String name;

    @Column(name = "category_description",nullable = false)
    private String description;

    @ManyToMany(mappedBy = "categoryList",fetch = FetchType.EAGER,cascade = {CascadeType.MERGE,CascadeType.PERSIST})
    private List<Book> bookList;

    public Category() {

    }

    public Category(String name, String description, List<Book> bookList) {
        this.name = name;
        this.description = description;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

}