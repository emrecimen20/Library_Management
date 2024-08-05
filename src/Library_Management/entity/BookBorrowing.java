package com.emre.Library_Management.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "bookBorrowings")
public class BookBorrowing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bookBorrow_id",columnDefinition = "serial")
    private int id;

    @Column(name = "borrower_name",nullable = false)
    private String borrowerName;

    @Column(name = "borrowing_date",nullable = false)
    private LocalDate borrowingDate;

    @Column(name = "borrow_returnDate")
    private LocalDate returnDate;

    @ManyToOne
    @JoinColumn(name = "bookBorrowing_book_id", referencedColumnName = "book_id")
    private Book book;

    public BookBorrowing() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBorrowerName() {
        return borrowerName;
    }

    public void setBorrowerName(String borrowerName) {
        this.borrowerName = borrowerName;
    }

    public LocalDate getBorrowingDate() {
        return borrowingDate;
    }

    public void setBorrowingDate(LocalDate borrowingDate) {
        this.borrowingDate = borrowingDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

}
