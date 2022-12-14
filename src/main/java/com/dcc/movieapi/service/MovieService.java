package com.dcc.movieapi.service;

import com.dcc.movieapi.data.Movie;
import com.dcc.movieapi.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public Movie saveMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    public Movie getMovieById(Integer id) {
        return movieRepository.findById(id).orElse(null);
    }

    public Movie updateMovieById(Movie newData, Integer id) {
        Movie movieToUpdate = movieRepository.findById(id).orElse(null);

        if (movieToUpdate != null) {
            newData.setId(id);
            return movieRepository.save(newData);
        }

        return null;
    }

    public void deleteMovieById(Integer id) {
        movieRepository.deleteById(id);
    }

    public List<Movie> getMoviesByGenre(String genre) {
        return movieRepository.findAll().stream().filter(m -> m.getGenre().equalsIgnoreCase(genre)).toList();
    }

    public List<Movie> getMoviesByName(String name) {
        return movieRepository.findAll().stream().filter(m -> m.getName().equalsIgnoreCase(name)).toList();
    }
}
