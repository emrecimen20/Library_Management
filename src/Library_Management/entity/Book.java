package com.emre.Library_Management.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id",columnDefinition = "serial")
    private int id;

    @Column(name = "book_name",nullable = false)
    private String name;

    @Column(name = "book_publicationyear",nullable = false)
    private int publicationYear;

    @Column(name = "book_stock")
    private int stock;

    @ManyToOne
    @JoinColumn(name = "book_author_id",referencedColumnName = "author_id")
    private Author author;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "book_publisher_id", referencedColumnName = "publisher_id")
    private Publisher publisher;

    @OneToMany(mappedBy = "book",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private List<BookBorrowing> bookBorrowingList;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "books2categories",
            joinColumns = {@JoinColumn(name = "books2categories_book_id")},
            inverseJoinColumns = {@JoinColumn(name = "books2categories_category_id")}
    )
    private List<Category> categoryList;

    public Book() {

    }

    public Book(String name, int publicationYear, int stock, Author author, Publisher publisher, List<BookBorrowing> bookBorrowingList, List<Category> categoryList) {
        this.name = name;
        this.publicationYear = publicationYear;
        this.stock = stock;
        this.author = author;
        this.publisher = publisher;
        this.bookBorrowingList = bookBorrowingList;
        this.categoryList = categoryList;
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

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public List<BookBorrowing> getBookBorrowingList() {
        return bookBorrowingList;
    }

    public void setBookBorrowingList(List<BookBorrowing> bookBorrowingList) {
        this.bookBorrowingList = bookBorrowingList;
    }

    public List<Category> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<Category> categoryList) {
        this.categoryList = categoryList;
    }

}
