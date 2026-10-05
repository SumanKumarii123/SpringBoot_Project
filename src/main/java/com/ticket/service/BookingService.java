package com.ticket.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ticket.entity.Booking;
import com.ticket.repository.BookingRepository;

@Service
public class BookingService {
	
	@Autowired
	private BookingRepository brepo;
	
	public List<Booking> getAllBookings(){
		return brepo.findAll();
	}
	
	public Booking getBookingById(Long id) {
		return brepo.findById(id).orElse(null);
	}
	
	public Booking createBooking(Booking booking) {
		return brepo.save(booking);
	}
	
	public void deleteBooking(Long id) {
		brepo.deleteById(id);
	}
	
	public Booking updateBooking(Long id,Booking booking) {
		Booking bk=brepo.findById(id).orElse(null);
		if(bk!=null) {
			bk.setBookingDate(booking.getBookingDate());
			bk.setCustomer(booking.getCustomer());
			bk.setMovie(booking.getMovie());
			bk.setSeats(booking.getSeats());
			bk.setTheater(booking.getTheater());
			return brepo.save(bk);
		}
		return null;
	}

}
