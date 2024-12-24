package com.example.MovieReviewPrivate.dto;

public class ApiResponseDto<T> {
    private String status;
    private String message;

    private T data;

    public ApiResponseDto(String status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public ApiResponseDto(String status, String message) {
        this.status = status;
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public T getData() {
        return data;
    }
}
