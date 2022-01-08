package com.example.bookstore.service;

import com.example.bookstore.dto.BookDto;
import com.example.bookstore.dto.CartDto;
import com.example.bookstore.dto.DetailsDto;
import com.example.bookstore.model.Book;
import com.example.bookstore.model.Cart;
import com.example.bookstore.model.Details;
import com.example.bookstore.repository.BookStoreRepository;
import com.example.bookstore.repository.CartRepository;
import com.example.bookstore.repository.DetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BookStoreService implements Iservice {

    @Autowired
    private BookStoreRepository bookStoreRepository;

    @Autowired
    private CartRepository cartRepository;

    @Autowired
    private DetailsRepository detailsRepository;

    @Override
    public Book addData(BookDto bookDto) {
        Book addData = new Book(bookDto);
        return bookStoreRepository.save(addData);
    }

    @Override
    public List<Book> getAllData() {
        return bookStoreRepository.findAll();
    }

    @Override
    public Cart addDataInCart(CartDto cartDto) {
        Cart cartData = new Cart(cartDto);
        System.out.println(cartDto.getAuthor());
        System.out.println(cartDto.getImage());
        System.out.println(cartDto.getPrice());
        System.out.println(cartDto.getQuantity());
        return cartRepository.save(cartData);
    }

    @Override
    public List<Cart> getAllCartValue() {
        return cartRepository.findAll();
    }

    @Override
    public void updateCart(Long id) {

    }


    @Override
    public void deleteAllDataFromCart() {
        cartRepository.deleteAllDataFromCart();
    }

    @Override
    public Details addDetails(DetailsDto detailsDto) {
        Details details = new Details(detailsDto);
        return detailsRepository.save(details);
    }


}
