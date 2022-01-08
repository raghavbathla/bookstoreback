package com.example.bookstore.controlller;


import com.example.bookstore.dto.BookDto;
import com.example.bookstore.dto.CartDto;
import com.example.bookstore.dto.DetailsDto;
import com.example.bookstore.dto.ResponseDto;
import com.example.bookstore.model.Book;
import com.example.bookstore.model.Cart;
import com.example.bookstore.model.Details;
import com.example.bookstore.service.BookStoreService;
import com.example.bookstore.service.Iservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookStoreController {
    @Autowired
    private Iservice bookStoreService;

    @GetMapping("/get")
    public ResponseEntity<ResponseDto> getBooks() {
        List<Book> bookData = bookStoreService.getAllData();
        return new ResponseEntity<ResponseDto>(new ResponseDto("Success", bookData), HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<ResponseDto> addBook(@RequestBody BookDto bookDto) {
        Book bookData = bookStoreService.addData(bookDto);
        return new ResponseEntity<ResponseDto>(new
                ResponseDto("Created Data", bookDto), HttpStatus.OK);
    }

    @PostMapping("/addInCart")
    public ResponseEntity<ResponseDto> addInCart(@RequestBody CartDto cartDto) {
        bookStoreService.addDataInCart(cartDto);
        System.out.println(cartDto.getAuthor());
        System.out.println(cartDto.getImage());
        System.out.println(cartDto.getPrice());
        System.out.println(cartDto.getQuantity());
        return new ResponseEntity<ResponseDto>(new ResponseDto("Created Data", cartDto), HttpStatus.OK);
    }

    @GetMapping("/deletecart")
    public ResponseEntity<String> deleteCart() {
        bookStoreService.deleteAllDataFromCart();
        return new ResponseEntity<String>("Deleted", HttpStatus.OK) ;
    }

@PostMapping("/customerdetails")
    public ResponseEntity<ResponseDto> addDetails(DetailsDto detailsDto){
        bookStoreService.addDetails(detailsDto);
        return new ResponseEntity<ResponseDto>(new ResponseDto("Updated Data Successfully",detailsDto),HttpStatus.OK);
}

@PostMapping("/allcartvalues")
    public ResponseEntity<ResponseDto> allCartsValue(){
    List<Cart> cartList = bookStoreService.getAllCartValue();
    return new ResponseEntity<ResponseDto>(new ResponseDto("Success", cartList), HttpStatus.OK);
}
}
