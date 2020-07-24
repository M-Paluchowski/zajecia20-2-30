package com.example.demo.manytomany.service;

import com.example.demo.manytomany.domain.Author;
import com.example.demo.manytomany.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AuthorService {

    private final AuthorRepository authorRepository;

    @Autowired
    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

//    @Transactional
    public void printAllBooks() {
        System.out.println();
        System.out.println("Print all books");
//        List<Author> all = authorRepository.findAll();
//        List<Author> all = authorRepository.findAllFetchBooks();
        List<Author> all = authorRepository.findAll();
        all.forEach(author -> System.out.println(author.getBooks()));
    }

    public void removeAuthor(Long id) {
        authorRepository.deleteById(id);
    }
}
