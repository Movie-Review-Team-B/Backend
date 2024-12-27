package com.example.MovieReviewPrivate.Controller;

import com.example.MovieReviewPrivate.dto.ApiResponseDto;
import com.example.MovieReviewPrivate.dto.MovieRequestDto;
import com.example.MovieReviewPrivate.dto.MovieResponseDto;
import com.example.MovieReviewPrivate.service.MovieService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/movies")
public class MovieController {
    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    // 영화 생성
    @PostMapping
    public ResponseEntity<Map<String, String>> createMovie(@RequestBody MovieRequestDto dto) {
        movieService.createMovie(dto);

        Map<String, String> response = new HashMap<>();
        response.put("status", "success");
        response.put("message", "영화가 생성되었습니다.");

        return ResponseEntity.status(201).body(response);
    }

    // 모든 영화 조회
    @GetMapping
    public ResponseEntity<ApiResponseDto<List<MovieResponseDto>>> getAllMovies(@RequestParam(value = "isScreening",required = false) Boolean isScreening) {
        List<MovieResponseDto> movies = movieService.getAllMovies();

        return ResponseEntity.status(200).body(new ApiResponseDto<>("success","영화 목록이 조회되었습니다.",movies));
    }

    // 영화 수정
    @PatchMapping("/{id}")
    public ResponseEntity<ApiResponseDto<Void>> updateMovie(@PathVariable Long id, @RequestBody MovieRequestDto dto) {
        movieService.updateMovie(id, dto);
        return ResponseEntity.status(200).body(new ApiResponseDto<>("success","할 일이 수정되었습니다."));
    }

    // 영화 삭제
    @DeleteMapping("/{id}")
    public ResponseEntity<ApiResponseDto<Void>> deleteMovie(@PathVariable Long id) {
        movieService.deleteMovie(id);
        return ResponseEntity.status(200).body(new ApiResponseDto<>("success","할 일이 삭제되었습니다."));
    }



}
