package org.example;

import java.time.LocalDate;

public class Entity {

    private String bookName;
    String author;
    double rate;
    LocalDate date;

    public Entity(String bookName, String author, double rate, LocalDate date) {
        this.bookName = bookName;
        this.author = author;
        this.rate = rate;
        this.date = date;
    }

    public Entity(String bookName, String author) {
        this.bookName = bookName;
        this.author = author;
    }

    public Entity() {

    }

    public void setBookName(String title) {
        this.bookName = title;
    }

    public String getBookName() {
        return bookName;
    }

    public String toString() {
        return "Книга: " + bookName +
                "\nАвтор: " + author+
                "\nЛичная оценка: " + rate+
                "\nДата добавления: " + date;

    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate() {
        this.date = LocalDate.now();
    }

    //    public void setAuthor(String write) {
//        return author = write;
//    }
}
