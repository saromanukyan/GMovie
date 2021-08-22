package com.example.gmovie.model;

import java.util.Objects;

public class Picture {
    private final int movieFrameID;
    private final String movieName;

    public Picture(int movieFrameID, String movieName) {
        this.movieFrameID = movieFrameID;
        this.movieName = movieName;
    }

    public int getMovieFrameID() {
        return movieFrameID;
    }

    public String getMovieName() {
        return movieName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Picture picture = (Picture) o;
        return movieFrameID == picture.movieFrameID &&
                Objects.equals(movieName, picture.movieName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movieFrameID, movieName);
    }
}
