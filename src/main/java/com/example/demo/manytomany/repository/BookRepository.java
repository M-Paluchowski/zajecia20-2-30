package com.example.demo.manytomany.repository;

import com.example.demo.manytomany.domain.Book;
import com.example.demo.onetomany.domain.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
