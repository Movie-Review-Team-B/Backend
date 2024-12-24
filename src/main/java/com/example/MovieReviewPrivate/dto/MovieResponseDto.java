package com.example.MovieReviewPrivate.dto;

import java.util.Date;

public class MovieResponseDto {
    private final Long id;
    private final String title;
    private final float rating;
    private final boolean isScreening;
    private final String genre;
    private final Date releaseDate;
    private final Date closeDate;

    public MovieResponseDto(Long id, String title, float rating, boolean isScreening, String genre, Date releaseDate, Date closeDate) {
        this.id=id;
        this.title=title;
        this.rating=rating;
        this.isScreening=isScreening;
        this.genre=genre;
        this.releaseDate=releaseDate;
        this.closeDate=closeDate;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
    public float getRating() {
        return rating;
    }
    public boolean isScreening() {
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
