package com.spring.Batchprocessingsystem.repository;

import com.spring.Batchprocessingsystem.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
