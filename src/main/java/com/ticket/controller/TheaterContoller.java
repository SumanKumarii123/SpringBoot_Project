package com.ticket.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ticket.entity.Theater;
import com.ticket.service.TheaterService;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping("/api/theaters")
public class TheaterContoller {
	
	@Autowired
	private TheaterService tservice;
	
	@GetMapping
	public List<Theater> getAllTheaters() {
		return tservice.getAllTheater();
	}

	@GetMapping("/{id}")
	public Theater getTheaterById(@PathVariable Long id) {
		return tservice.getTheaterById(id);
	}
	
	@PostMapping
	public Theater createTheater(@RequestBody Theater theater) {
		return tservice.saveTheater(theater);
	}
	
	@PutMapping("/{id}")
	public Theater putMethodName(@PathVariable Long id, @RequestBody Theater theater) {
		return tservice.updateTheater(id, theater);
	}
	
	@DeleteMapping("/{id}")
	public void deleteTheater(@PathVariable Long id) {
		tservice.deleteTheater(id);
	}
}
