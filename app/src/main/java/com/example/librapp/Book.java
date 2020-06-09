package com.example.librapp;

import java.io.Serializable;

public class Book implements Serializable {

    String author;
    String title;
    String isbn;
    String category;
    String desc;


    //TODO future ideas
    /*String desc;
    double rating;
    String image;
    String id;*/

    public Book() {
    }



    public Book(String author, String title, String isbn, String category, String desc) {
        this.author = author;
        this.title = title;
        this.isbn = isbn;
        this.category = category;
        this. desc = desc;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }


}
