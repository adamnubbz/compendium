package io.adamnubbz.compendium.controller;

import io.adamnubbz.compendium.model.Anime;
import io.adamnubbz.compendium.service.AnimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/anime")
public class AnimeController {

    @Autowired
    private AnimeService animeService;

    @GetMapping
    public ResponseEntity<List<Anime>> getAllAnime() {
        return new ResponseEntity<List<Anime>>(animeService.retrieveAllAnime(), HttpStatus.OK);
    }

//    @GetMapping("/{imdbID}")
//    public ResponseEntity<Optional<Anime>> getAnime(@PathVariable String imdbID) {
//        return new ResponseEntity<Optional<Anime>>(animeService.retrieveAnime(imdbID), HttpStatus.OK);
//    }
}

