package com.example.MovieReviewPrivate.dto;

import jakarta.persistence.Column;

import java.util.Date;

public class MovieRequestDto {
    private final String title;

    private final float rating;

    private final Boolean isScreening;

    private final String genre;

    private final Date releaseDate;

    private final Date closeDate;

    public MovieRequestDto(String title, float rating, Boolean isScreening, String genre, Date releaseDate, Date closeDate) {
        this.title = title;
        this.rating = rating;
        this.isScreening = isScreening;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.closeDate = closeDate;
    }

    public String getTitle() {
        return title;
    }
    public float getRating() {
        return rating;
    }

    public Boolean getScreening() {
        return isScreening;
    }

    public String getGenre() {
        return genre;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public Date getCloseDate() {
        return closeDate;
    }

}
