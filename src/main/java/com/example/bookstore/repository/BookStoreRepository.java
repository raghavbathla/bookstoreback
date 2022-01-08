package com.example.bookstore.repository;


import com.example.bookstore.model.Book;
import org.apache.el.parser.JJTELParserState;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookStoreRepository extends JpaRepository<Book, Long> {

}
