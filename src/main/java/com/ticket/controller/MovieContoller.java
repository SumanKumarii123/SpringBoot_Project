package com.ticket.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ticket.entity.Movie;
import com.ticket.service.MovieService;

@RestController
@RequestMapping("/api/movies")
public class MovieContoller {
	
	@Autowired
	private MovieService mservice;
	
	@GetMapping
	public List<Movie> getAllMovies(){
		return mservice.getAllMovies();
	}
	
	@GetMapping("/{id}")
	public Movie getMovieById(@PathVariable Long id) {
		return mservice.getMovieById(id);
	}
	
	@PostMapping
	public Movie createMovie(@RequestBody Movie movie) {
		return mservice.saveMovie(movie);
	}
	
	@PutMapping("/{id}")
	public Movie updateMovie(@PathVariable Long id,@RequestBody Movie movie) {
		return mservice.updateMovie(id, movie);
	}
	
	@DeleteMapping("/{id}")
	public String deleteMovie(@PathVariable Long id) {
		mservice.deleteMovie(id);
		return "Movie deleted successfully";
	}
	
}
