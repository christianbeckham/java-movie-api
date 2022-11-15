package com.dcc.movieapi.repository;

import com.dcc.movieapi.data.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
}
