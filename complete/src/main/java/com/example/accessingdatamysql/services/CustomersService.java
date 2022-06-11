package com.example.accessingdatamysql.services;

import com.example.accessingdatamysql.dto.CreateCustomerDto;
import com.example.accessingdatamysql.dto.UpdateCustomerDto;
import com.example.accessingdatamysql.entities.Customer;
import com.example.accessingdatamysql.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CustomersService {
    private final CustomerRepository customerRepository;

    @Autowired
    public CustomersService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer create(CreateCustomerDto customerDto) {
        Customer customer = new Customer();
        customer.setName(customerDto.name);
        customer.setPhone(customerDto.phone);
        customer.setStreet(customerDto.street);
        customer.setPostcode(customerDto.postcode);
        customer.setLocation(customerDto.location);
        customer.setParticularities(customerDto.particularities);
        customer.setTrial(customerDto.trial);

        Long id = customerRepository.findTopByOrderByIdDesc().getId();
        customer.setId(id);

        if (customerRepository.existsByPhone(customerDto.phone)) {
            throw new DataIntegrityViolationException("customer already exists");
        }

        return customerRepository.save(customer);
    }

    public List<Customer> list() {
        return (List<Customer>) customerRepository.findAll();
    }


    public Customer findByPhone(String phone) {
        return customerRepository.findByPhone(phone);
    }

    public Customer update(Long id, UpdateCustomerDto updateCustomerDto) {
        Customer customerToBeUpdated = customerRepository.findById(id);

        if(updateCustomerDto.phone != null) {
            customerToBeUpdated.setPhone(updateCustomerDto.phone);
        }

        if (updateCustomerDto.location != null) {
            customerToBeUpdated.setLocation(updateCustomerDto.location);
        }

        if (updateCustomerDto.street != null) {
            customerToBeUpdated.setStreet(updateCustomerDto.street);
        }

        if (updateCustomerDto.postcode != null) {
            customerToBeUpdated.setPostcode(updateCustomerDto.postcode);
        }

        if (updateCustomerDto.particularities != null) {
            customerToBeUpdated.setParticularities(updateCustomerDto.particularities);
        }

        if (updateCustomerDto.trial != null) {
            customerToBeUpdated.setTrial(updateCustomerDto.trial);
        }

        return customerRepository.save(customerToBeUpdated);
    }
}
