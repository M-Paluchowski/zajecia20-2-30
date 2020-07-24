package com.example.demo.manytomany.repository;

import com.example.demo.manytomany.domain.Author;
import com.example.demo.onetomany.domain.Car;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AuthorRepository extends JpaRepository<Author, Long> {

    @Query("SELECT DISTINCT a FROM Author a LEFT JOIN FETCH a.books")
    List<Author> findAllFetchBooks();

    @EntityGraph(attributePaths = {"books"})
    List<Author> findAll();
}
