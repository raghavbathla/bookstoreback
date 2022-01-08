package com.example.bookstore.model;

import com.example.bookstore.dto.BookDto;
import com.example.bookstore.dto.CartDto;

import javax.persistence.*;

@Entity
@Table(name = "cart")
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    private String image;
    private String price;
    private String quantity;
    private String author;

    public Cart(CartDto cartDto) {
        this.image = cartDto.getImage();
        this.price = cartDto.getPrice();
        this.author = cartDto.getAuthor();
        this.quantity = cartDto.getQuantity();

    }

    public Cart() {

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
