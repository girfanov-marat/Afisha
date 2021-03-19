package tech.itpark.manager;

import tech.itpark.domain.Movie;

import java.util.ArrayList;

public class MovieManager {
    private ArrayList<Movie> movieList = new ArrayList<>();

    public void addMovie(Movie movie){
        movieList.add(movie);
    }

    public void deleteMovie(Movie movie) {
        movieList.remove(movie);
    }
}
