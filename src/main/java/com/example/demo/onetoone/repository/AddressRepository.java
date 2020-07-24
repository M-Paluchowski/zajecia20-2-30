package com.example.demo.onetoone.repository;

import com.example.demo.onetoone.domain.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
