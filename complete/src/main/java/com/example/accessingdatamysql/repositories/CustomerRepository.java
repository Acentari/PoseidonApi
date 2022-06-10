package com.example.accessingdatamysql.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.accessingdatamysql.entities.Customer;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
    Customer findByPhone(String phone);
    Customer findTopByOrderByIdDesc();
}
