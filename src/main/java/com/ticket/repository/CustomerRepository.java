package com.ticket.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ticket.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
