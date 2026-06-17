package com.example.demo.repository;

import java.util.List;
import java.util.Optional;
import com.example.demo.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.*;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Optional<Customer>findByEmail(String email);
    List<Customer> findByCity(String city);
    List<Customer> findByAgeGreaterThan(int age);

}
