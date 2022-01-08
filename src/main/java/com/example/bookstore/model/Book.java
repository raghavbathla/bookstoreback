package com.example.bookstore.model;

import com.example.bookstore.dto.BookDto;

import javax.persistence.*;

@Entity
@Table(name = "book_store")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    private String image;
    private String price;
    private String author;

    public Book(BookDto bookDto) {
        this.image = bookDto.getImage();
        this.price = bookDto.getPrice();
        this.author = bookDto.getAuthor();

    }

    public Book() {
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
