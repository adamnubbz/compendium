package io.adamnubbz.compendium.service;

import io.adamnubbz.compendium.model.Movie;
import io.adamnubbz.compendium.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;
    public List<Movie> retrieveAllMovies() {
        return movieRepository.findAll();
    }

    public Optional<Movie> retrieveMovie(String imdbID) {
        return movieRepository.findMovieByImdbID(imdbID);
    }
}