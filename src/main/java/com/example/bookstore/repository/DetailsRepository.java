package com.example.bookstore.repository;


import com.example.bookstore.model.Book;
import com.example.bookstore.model.Details;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetailsRepository extends JpaRepository<Details, Long> {

}
