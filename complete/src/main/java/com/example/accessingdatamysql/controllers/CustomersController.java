package com.example.accessingdatamysql.controllers;

import com.example.accessingdatamysql.dto.CreateCustomerDto;
import com.example.accessingdatamysql.entities.Customer;
import com.example.accessingdatamysql.services.CustomersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

@RestController	// This means that this class is a Controller
@RequestMapping("/customers") // This means URL's start with /demo (after Application path)
public class CustomersController {

	private final CustomersService customersService;

	@Autowired
	public CustomersController(CustomersService customersService) {
		this.customersService = customersService;
	}

	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping // Map ONLY POST Requests
	public Customer create(
			@RequestBody
			@Valid
			@NotNull
			CreateCustomerDto customerDto
	) {
		return customersService.create(customerDto);
	}

	//This returns a JSON or XML with the users
	@ResponseStatus(HttpStatus.OK)
	@GetMapping
	public List<Customer> list() {
		return customersService.list();
	}

	@GetMapping("/{phone}")
	public Customer findByPhone(
			@PathVariable(value = "phone") String phone
	){
		return customersService.findByPhone(phone);
	}

}
