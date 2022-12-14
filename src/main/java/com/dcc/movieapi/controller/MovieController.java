package com.dcc.movieapi.controller;

import com.dcc.movieapi.data.Movie;
import com.dcc.movieapi.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
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

// Method with optional request parameters
// to use the same endpoint of "/movies"
// as the above method
//
//    @GetMapping("/movies")
//    public List<Movie> findAllMovies(
//            @RequestParam(required = false) String genre,
//            @RequestParam(required = false) String name
//    ) {
//        if (genre != null) { return movieService.getMoviesByGenre(genre); }
//        if (name != null) { return movieService.getMoviesByName(name); }
//        return movieService.getAllMovies();
//    }

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

    @GetMapping("/movies/GetByGenre/{genre}")
    public List<Movie> getMoviesByGenre(@PathVariable String genre) {
        return movieService.getMoviesByGenre(genre);
    }

    @GetMapping("/movies/GetByName/{name}")
    public List<Movie> getMoviesByName(@PathVariable String name) {
        return movieService.getMoviesByName(name);
    }
}
