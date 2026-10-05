package com.ticket.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ticket.entity.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long> {

}
