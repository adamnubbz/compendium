package io.adamnubbz.compendium.controller;

import io.adamnubbz.compendium.model.Anime;
import io.adamnubbz.compendium.model.Movie;
import io.adamnubbz.compendium.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies() {
        return new ResponseEntity<List<Movie>>(movieService.retrieveAllMovies(), HttpStatus.OK);
    }

    @GetMapping("/{imdbID}")
    public ResponseEntity<Optional<Movie>> getMovie(@PathVariable String imdbID) {
        return new ResponseEntity<Optional<Movie>>(movieService.retrieveMovie(imdbID), HttpStatus.OK);
    }
}
