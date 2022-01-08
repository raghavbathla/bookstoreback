package com.example.bookstore.dto;


import lombok.Data;

public class BookDto {
    private String image;
    private String price;
    private String author;

    public BookDto(String image, String price, String author) {
        this.image = image;
        this.price = price;
        this.author = author;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
