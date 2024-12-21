package com.example.MovieReviewPrivate.Controller;

import com.example.MovieReviewPrivate.dto.MovieRequestDto;
import com.example.MovieReviewPrivate.service.MovieService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/movies")
public class MovieController {
    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @PostMapping
    public ResponseEntity<Map<String, String>> createMovie(@RequestBody MovieRequestDto dto) {
        movieService.createMovie(dto);
        Map<String,String>  response = new HashMap<>();
        response.put("message","영화가 성공적으로 생성되었습니다.");
        return ResponseEntity.status(201).body(response);
    }
}
