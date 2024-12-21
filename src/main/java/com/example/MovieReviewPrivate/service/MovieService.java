package com.example.MovieReviewPrivate.service;

import com.example.MovieReviewPrivate.dto.MovieRequestDto;
import com.example.MovieReviewPrivate.entity.Movie;
import com.example.MovieReviewPrivate.repository.MovieRepository;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public void createMovie(MovieRequestDto dto) {
        Movie movie = new Movie(dto.getTitle(),dto.getIsScreening(),dto.getGenre(),dto.getReleaseDate(),dto.getCloseDate());
        movieRepository.save(movie);
    }
}
