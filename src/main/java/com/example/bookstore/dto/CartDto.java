package com.example.bookstore.dto;


public class CartDto {
    private String image;
    private String price;
    private String author;
    private String quantity;

    public CartDto(String image, String price, String author, String quantity) {
        this.image = image;
        this.price = price;
        this.author = author;
        this.quantity = quantity;
    }


    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
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
