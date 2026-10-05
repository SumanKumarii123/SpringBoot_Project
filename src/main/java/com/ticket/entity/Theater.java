package com.ticket.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Theater {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long theater_id;
	
	private String theater_name;
	private String location;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private List<Movie> movie;
	
	public Theater() {
		
	}

	public Long getTheater_id() {
		return theater_id;
	}

	public void setTheater_id(Long theater_id) {
		this.theater_id = theater_id;
	}

	public String getTheater_name() {
		return theater_name;
	}

	public void setTheater_name(String theater_name) {
		this.theater_name = theater_name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<Movie> getMovie() {
		return movie;
	}

	public void setMovie(List<Movie> movie) {
		this.movie = movie;
	}
	
	
}
