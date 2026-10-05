package com.ticket.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ticket.entity.Booking;
import com.ticket.service.BookingService;

import jakarta.websocket.server.PathParam;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api/bookings")
public class BookingController {

	@Autowired
	private BookingService bservice;
	
	@GetMapping
	public List<Booking> getAllBookingDetailes(){
		return bservice.getAllBookings();
	}
	
	@GetMapping("/{id}")
	public Booking getBookingById(@PathVariable Long id) {
		return bservice.getBookingById(id);
	}
	
	@PostMapping
	public Booking createBookingDetailes(Booking booking) {
		return bservice.createBooking(booking);
	}
	
	@PutMapping("{id}")
	public Booking updateBookingById(@PathVariable Long id, @RequestBody Booking booking) {
		return bservice.updateBooking(id, booking);
	}
	
	@DeleteMapping("/{id}")
	public void deleteBookingById(@PathVariable Long id) {
		bservice.deleteBooking(id);
	}
	
}
