package com.ticket.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ticket.entity.Theater;

public interface TheaterRepository  extends JpaRepository<Theater, Long>{

}
