package movieselector;

import java.util.ArrayList;

/**
 *
 * @author jrtew
 */

// The movie class has all the information for creating a movie object:
public class Movie {
    
    private String title;
    private ArrayList genres;
    private int releaseDate;
    private int runtime;
    private double imdbScore;
    private String awards;
    private String color;

    public Movie() {
    }
    
    // This constructor is used in the XMLQuery class for creating each movie object:
    public Movie(String title, ArrayList genres, int releaseDate, int runtime, double imdbScore, String awards, String color) {
        this.title = title;
        this.genres = genres;
        this.releaseDate = releaseDate;
        this.runtime = runtime;
        this.imdbScore = imdbScore;
        this.awards = awards;
        this.color = color;
    }

    public String getTitle() {
        return title;
    }
    
    public ArrayList getGenres() {
        return genres;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public int getRuntime() {
        return runtime;
    }

    public double getImdbScore() {
        return imdbScore;
    }

    public String getAwards() {
        return awards;
    }

    public String getColor() {
        return color;
    }
    
    
}
