package com.dcc.movieapi.service;

import com.dcc.movieapi.data.Movie;
import com.dcc.movieapi.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;
    
    public Movie save_movie(Movie movie) {
        return movieRepository.save(movie);
    }
}
