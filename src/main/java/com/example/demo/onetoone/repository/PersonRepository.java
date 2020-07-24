package com.example.demo.onetoone.repository;

import com.example.demo.onetoone.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
