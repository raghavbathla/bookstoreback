package com.example.bookstore.service;

import com.example.bookstore.dto.BookDto;
import com.example.bookstore.dto.CartDto;
import com.example.bookstore.dto.DetailsDto;
import com.example.bookstore.model.Book;
import com.example.bookstore.model.Cart;
import com.example.bookstore.model.Details;

import java.util.List;

public interface Iservice {
    Book addData(BookDto bookDto);

    List<Book> getAllData();

    Cart addDataInCart(CartDto cartDto);

    List<Cart> getAllCartValue();

    void updateCart(Long id);

    void deleteAllDataFromCart();

    Details addDetails(DetailsDto detailsDto);


}
