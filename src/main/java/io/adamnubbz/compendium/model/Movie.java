package io.adamnubbz.compendium.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "movies")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
    @Id
    private ObjectId id;
    private String imdbID;
    private String Title;
    private String Released;
    private String Poster;
    private List<String> Genre ;

    public Movie(String imdbID, String Title, String Released, String Poster, List<String> Genre) {
        this.imdbID = imdbID;
        this.Title = Title;
        this.Released = Released;
        this.Poster = Poster;
        this.Genre = Genre;
    }
}
