package com.example.MovieReviewPrivate.service;

import com.example.MovieReviewPrivate.dto.MovieRequestDto;
import com.example.MovieReviewPrivate.dto.MovieResponseDto;
import com.example.MovieReviewPrivate.entity.Movie;
import com.example.MovieReviewPrivate.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public MovieResponseDto getMovieById(Long id) {
        Movie movie = movieRepository.findById(id).orElse(null);
        return movie.toDto();
    }

    public List<MovieResponseDto> getAllMovies() {
        List<Movie> movies = movieRepository.findAll();
        return movies.stream().map(Movie::toDto).toList();
    }

    public void updateMovie(Long id, MovieRequestDto dto) {
        Movie movie = movieRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 영화가 존재하지 않습니다."));
        movie.update(dto.getTitle(),dto.getIsScreening(),dto.getGenre(),dto.getReleaseDate(),dto.getCloseDate());
        movieRepository.save(movie);
    }

    public void deleteMovie(Long id) {
        Movie movie = movieRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 영화가 존재하지 않습니다."));
        movieRepository.delete(movie);
    }


}
