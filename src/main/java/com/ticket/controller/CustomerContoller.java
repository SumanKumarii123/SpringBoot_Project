package com.ticket.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ticket.entity.Customer;
import com.ticket.service.CustomerService;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/api/customers")
public class CustomerContoller {
	
	@Autowired
	private CustomerService cservice;
	
	@GetMapping
	public List<Customer> getAllCustomers(){
		return cservice.getAllCustomer();
	}
	
	@GetMapping("/{id}")
	public Customer getCustomerById(Long id) {
		return cservice.getCustomerById(id);
	}
	
	@PostMapping()
	public Customer createCustomerDetailes(Customer customer) {
		return cservice.createCustomer(customer);
	}
	
	@PutMapping("/{id}")
	public Customer putMethodName(@PathVariable Long  id, @RequestBody Customer customer) {
		return  cservice.updateCustomer(id, customer);
	}
	
	@DeleteMapping("/{id}")
	public void deleteCustiomerDetailes(Long id) {
		cservice.deleteCustomer(id);
	}

}
