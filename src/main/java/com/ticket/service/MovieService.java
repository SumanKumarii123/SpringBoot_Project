package com.ticket.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ticket.entity.Movie;
import com.ticket.repository.MovieRepository;

@Service
public class MovieService {
	
	@Autowired
	private MovieRepository movierepo;
	
	public List<Movie> getAllMovies(){
		return movierepo.findAll();
	}
	
	public Movie getMovieById(Long id) {
		return movierepo.findById(id).orElse(null);
	}
	
	public Movie saveMovie(Movie movie) {
		return movierepo.save(movie);
	}
	public void deleteMovie(Long id) {
		movierepo.deleteById(id);
	}
	
	public Movie updateMovie(Long id,Movie movie) {
		Movie mv=movierepo.findById(id).orElse(null);
		if(mv!=null) {
			mv.setTitle(movie.getTitle());
			mv.setGenre(movie.getGenre());
			mv.setTheaters(movie.getTheaters());
			return movierepo.save(mv);
		}
		return null;
	}

}
