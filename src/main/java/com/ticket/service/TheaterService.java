package com.ticket.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ticket.entity.Theater;
import com.ticket.repository.TheaterRepository;

@Service
public class TheaterService {

	@Autowired
	private TheaterRepository trepo;
	
	
	public List<Theater> getAllTheater(){
		return trepo.findAll();
	}
	
	public Theater getTheaterById(Long id) {
		return trepo.findById(id).orElse(null);
	}
	
	public Theater saveTheater(Theater theater) {
		return trepo.save(theater);
	}
	
	public void deleteTheater(Long id) {
		 trepo.deleteById(id);
	}
	
	public Theater updateTheater(Long id,Theater theater) {
		Theater th=trepo.findById(id).orElse(null);
		if(th!=null) {
			th.setTheater_name(theater.getTheater_name());
			th.setMovie(theater.getMovie());
			th.setLocation(theater.getLocation());
			return trepo.save(th);
		}
		return null;
	}
	
}
