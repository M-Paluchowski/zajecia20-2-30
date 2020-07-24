package com.example.demo.onetomany.repository;

import com.example.demo.onetomany.domain.Car;
import com.example.demo.onetoone.domain.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}
