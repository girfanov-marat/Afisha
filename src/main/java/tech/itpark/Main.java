package tech.itpark;

import tech.itpark.domain.Movie;
import tech.itpark.manager.MovieManager;

public class Main {
    public static void main(String[] args) {
        Movie asd_movie = new Movie("asd", "01.01.2001", 2.0F, "https://", true);
        Movie das_movie = new Movie("das", "01.01.2002", 9.0F, "https://", false);

        MovieManager manager = new MovieManager();
        manager.addMovie(asd_movie);
        manager.addMovie(das_movie);

        manager.deleteMovie(asd_movie);
    }
}
