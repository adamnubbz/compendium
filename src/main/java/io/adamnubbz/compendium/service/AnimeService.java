package io.adamnubbz.compendium.service;

import io.adamnubbz.compendium.model.Anime;
import io.adamnubbz.compendium.repository.AnimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimeService {
    @Autowired
    private AnimeRepository animeRepository;
    public List<Anime> retrieveAllAnime() {
        return animeRepository.findAll();
    }

//    public Optional<Anime> retrieveAnime(String imdbID) {
//        return animeRepository.findMovieByImdbID(imdbID);
//    }
}

