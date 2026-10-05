package com.ticket.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ticket.entity.Customer;
import com.ticket.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository crepo;
	
	public List<Customer> getAllCustomer(){
		return crepo.findAll();
	}
	
	public Customer getCustomerById(Long id) {
		return crepo.findById(id).orElse(null);
	}
	
	public Customer createCustomer(Customer customer) {
		return crepo.save(customer);
	}
	
	public void deleteCustomer(Long id) {
		crepo.deleteById(id);
	}
	
	public Customer updateCustomer(Long id,Customer customer) {
		Customer cs=crepo.findById(id).orElse(null);
		if(cs!=null) {
			cs.setCus_name(customer.getCus_name());
			cs.setEmail(customer.getEmail());
			cs.setBookings(customer.getBookings());
			return crepo.save(cs);
		}
		return null;
	}
	

}
