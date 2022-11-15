package com.dcc.movieapi.controller;

import com.dcc.movieapi.data.Movie;
import com.dcc.movieapi.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public List<Movie> findAllMovies(
            @RequestParam(required = false) String genre,
            @RequestParam(required = false) String name
    ) {
        if (genre != null) { return movieService.getMoviesByGenre(genre); }
        if (name != null) { return movieService.getMoviesByName(name); }
        return movieService.getAllMovies();
    }

    @GetMapping("/movies/{id}")
    public Movie getMovieById(@PathVariable Integer id) {
        return movieService.getMovieById(id);
    }

    @PutMapping("/movies/{id}")
    public Movie updateMovieById(@RequestBody Movie movieData, @PathVariable Integer id) {
        return movieService.updateMovieById(movieData, id);
    }

    @DeleteMapping("/movies/{id}")
    public void deleteMovieById(@PathVariable Integer id) {
        movieService.deleteMovieById(id);
    }
}
