package com.example.MovieReviewPrivate.repository;

import com.example.MovieReviewPrivate.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie,Long> {

}
