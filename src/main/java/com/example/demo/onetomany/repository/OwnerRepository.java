package com.example.demo.onetomany.repository;

import com.example.demo.onetomany.domain.Car;
import com.example.demo.onetomany.domain.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OwnerRepository extends JpaRepository<Owner, Long> {
}
