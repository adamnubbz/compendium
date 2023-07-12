package io.adamnubbz.compendium.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Map;

@Document(collection="anime")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Anime {
    Integer mal_id; // "mal_id": 0,
    String url; // "url": "string",
    private Map<String, Object> images;; // "images": {},
    //Trailer trailer; // "trailer": {},
    boolean approved; // "approved": true,
    //Titles titles; // "titles": [],
    String title; // "title": "string",
    String titleEnglish; // "title_english": "string",
    String titleJapanese; // "title_japanese": "string",
    String[] titleSynonyms; // "title_synonyms": [],
    //enum Type type; // "type": "TV",
    String source; // "source": "string",
    Integer episodes; // "episodes": 0,
    //enum Status status; //"status": "Finished Airing",
    boolean airing; // "airing": true,
    // AiredDate aired; // "aired": {},
    String duration; // "duration": "string",
    // enum Rating rating; // "rating": "G - All Ages",
    Integer score; // "score": 0,
    Integer scoredBy; // "scored_by": 0,
    Integer rank; // "rank": 0,
    Integer popularity; // "popularity": 0,
    Integer members; // "members": 0,
    Integer favorites; // "favorites": 0,
    String synopsis; // "synopsis": "string",
    String background; // "background": "string",
    String season; // "season": "summer",
    Integer year; // "year": 0,
}
