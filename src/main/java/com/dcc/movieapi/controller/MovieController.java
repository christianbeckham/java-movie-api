package com.dcc.movieapi.controller;

import com.dcc.movieapi.data.Movie;
import com.dcc.movieapi.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController {

    @Autowired
    private MovieService movieService;

    @PostMapping("/addMovie")
    public Movie addMovie(@RequestBody Movie movie) {
        return movieService.saveMovie(movie);
    }

    @GetMapping("/movies")
    public List<Movie> findAllMovies() {
        return movieService.getAllMovies();
    }
}
