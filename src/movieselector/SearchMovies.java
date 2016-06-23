package movieselector;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import org.dom4j.DocumentException;

/**
 *
 * @author jrtew
 */

// This class has the method that is used for searching the array list of movie objects:
public class SearchMovies {
    
    private String genreVal;
    private String genreVal2;
    private int releasedVal;
    private int runtimeVal;
    private double scoreVal;
    private String awardsVal;
    private String colorVal;
    private String gender;
    private String genderGenre;
    private String genderGenre2;
    
    // This constructor sets the default values of runtimeVal and awardsVal when used:
    public SearchMovies() {
        runtimeVal = 1000;
        awardsVal = "either";
    }
    
    public void setGenreVal(String genreVal) {
        this.genreVal = genreVal;
    }

    public String getGenreVal() {
        return genreVal;
    }

    public void setGenreVal2(String genreVal2) {
        this.genreVal2 = genreVal2;
    }
    
    public String getGenreVal2() {
        return genreVal2;
    }

    public void setReleasedVal(int releasedVal) {
        this.releasedVal = releasedVal;
    }

    public void setRuntimeVal(int runtimeVal) {
        this.runtimeVal = runtimeVal;
    }

    public void setScoreVal(double scoreVal) {
        this.scoreVal = scoreVal;
    }

    public void setAwardsVal(String awardsVal) {
        this.awardsVal = awardsVal;
    }

    public void setColorVal(String colorVal) {
        this.colorVal = colorVal;
    } 
    
    public void setGender(String gender) {
        this.gender = gender;
    } 

    public String getGender() {
        return gender;
    }

    public String getGenderGenre() {
        return genderGenre;
    }
    
    public String getGenderGenre2() {
        return genderGenre2;
    }
    
    // The searchMovieList searches the movie objects for movies that fit the search criteria:
    public ArrayList searchMovieList() throws DocumentException, FileNotFoundException {
        
        ArrayList<Movie> returnedMovies = new ArrayList();
        
        XMLQuery allMovies = new XMLQuery();
        ArrayList<Movie> movieList = new ArrayList();
        movieList = allMovies.getMovieInfo();
        
        Movie tempyMoo = new Movie();
        
        // Iterate through the list, storing the movie objects that fit the search criteria:
        for (int i = 0; i < movieList.size(); i++) {
            tempyMoo = movieList.get(i);
            ArrayList tempyG = tempyMoo.getGenres();
            for (int j = 0; j < tempyG.size(); j++) {
                if (tempyG.get(j).equals(genreVal)) {
                    for (int k = 0; k < tempyG.size(); k++) {
                        if (tempyG.get(k).equals(genreVal2)) {
                            if (tempyMoo.getReleaseDate() >= releasedVal) {
                                if (tempyMoo.getRuntime() <= runtimeVal) {
                                    if (tempyMoo.getImdbScore() >= scoreVal) {
                                        if (awardsVal.equals("yes") || awardsVal.equals("no")) {
                                            if (tempyMoo.getAwards().equals(awardsVal)) {
                                                if (colorVal.equals("color") || colorVal.equals("bw")) {
                                                    if (tempyMoo.getColor().equals(colorVal)) {
                                                        returnedMovies.add(tempyMoo);
                                                    }
                                                } else {
                                                    returnedMovies.add(tempyMoo);
                                                }
                                            }
                                        } else {
                                            if (colorVal.equals("color") || colorVal.equals("bw")) {
                                                if (tempyMoo.getColor().equals(colorVal)) {
                                                    returnedMovies.add(tempyMoo);
                                                }
                                            } else {
                                                returnedMovies.add(tempyMoo);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        
        // If the returnedMovies array list from above is larger than 3 items,
        // then the gender rules below will fire:
        ArrayList<Movie> returnedMovies2 = new ArrayList();
        String tempGenGen = "";
        String tempGenGen2 = "";
        genderGenre = "";
        genderGenre2 = "";
        if (gender != null) {
            // The first gender rule:
            if (returnedMovies.size() > 3) {
                Movie tempyMoo2 = new Movie();
                if (gender.equals("Female")) {
                    for (int i = 0; i < returnedMovies.size(); i++) {
                        tempyMoo2 = returnedMovies.get(i);
                        ArrayList tempyG = tempyMoo2.getGenres();
                        for (int j = 0; j < tempyG.size(); j++) {
                            if (tempyG.get(j).equals("Romance")) {
                                returnedMovies2.add(tempyMoo2);
                                tempGenGen = "Romance";
                            }
                        }
                    }
                } else {
                    for (int i = 0; i < returnedMovies.size(); i++) {
                        tempyMoo2 = returnedMovies.get(i);
                        ArrayList tempyG = tempyMoo2.getGenres();
                        for (int j = 0; j < tempyG.size(); j++) {
                            if (tempyG.get(j).equals("Action")) {
                                returnedMovies2.add(tempyMoo2);
                                tempGenGen = "Action";
                            }
                        }
                    }
                }
            }
            // The back up rule for the first gender rule. This fires if the one
            // above returns zero items:
            if (returnedMovies2.isEmpty()) {
                Movie tempyMoo2 = new Movie();
                if (gender.equals("Female")) {
                    for (int i = 0; i < returnedMovies.size(); i++) {
                        tempyMoo2 = returnedMovies.get(i);
                        ArrayList tempyG = tempyMoo2.getGenres();
                        for (int j = 0; j < tempyG.size(); j++) {
                            if (tempyG.get(j).equals("Drama")) {
                                returnedMovies2.add(tempyMoo2);
                                tempGenGen = "Drama";
                            }
                        }
                    }
                } else {
                    for (int i = 0; i < returnedMovies.size(); i++) {
                        tempyMoo2 = returnedMovies.get(i);
                        ArrayList tempyG = tempyMoo2.getGenres();
                        for (int j = 0; j < tempyG.size(); j++) {
                            if (tempyG.get(j).equals("Sci-Fi")) {
                                returnedMovies2.add(tempyMoo2);
                                tempGenGen = "Sci-Fi";
                            }
                        }
                    }
                }
            }

            ArrayList<Movie> returnedMovies3 = new ArrayList();
            // This is the second gender rule. This fires if the first rule (not the
            // back-up) fires and the list it returns is greater than 3:
            if (returnedMovies2.size() > 3) {
                Movie tempyMoo2 = new Movie();
                if (gender.equals("Female")) {
                    for (int i = 0; i < returnedMovies2.size(); i++) {
                        tempyMoo2 = returnedMovies2.get(i);
                        ArrayList tempyG = tempyMoo2.getGenres();
                        for (int j = 0; j < tempyG.size(); j++) {
                            if (tempyG.get(j).equals("Drama")) {
                                returnedMovies3.add(tempyMoo2);
                                tempGenGen2 = "Drama";
                            }
                        }
                    }
                } else {
                    for (int i = 0; i < returnedMovies2.size(); i++) {
                        tempyMoo2 = returnedMovies2.get(i);
                        ArrayList tempyG = tempyMoo2.getGenres();
                        for (int j = 0; j < tempyG.size(); j++) {
                            if (tempyG.get(j).equals("Sci-Fi")) {
                                returnedMovies3.add(tempyMoo2);
                                tempGenGen2 = "Sci-Fi";
                            }
                        }
                    }
                }
            }
            int tempSize2 = returnedMovies2.size();
            int tempSize3 = returnedMovies3.size();
            
            if (tempSize2 == tempSize3){
                tempGenGen2 = "";
            }
            
            // The following statements are for keeping track of the gender rules,
            // including which genres have been applied to the decision making process:
            if (returnedMovies2.size() > 3) {
                if (!returnedMovies3.isEmpty()) {
                    if (tempGenGen2.equals("Drama")) {
                        genderGenre2 = "Drama";
                        genderGenre = tempGenGen;
                    } else if (tempGenGen2.equals("Sci-Fi")){
                        genderGenre2 = "Sci-Fi";
                        genderGenre = tempGenGen;
                    } else if (tempGenGen2.equals("")) {
                        genderGenre2 = "";
                        genderGenre = tempGenGen;
                    }
                    return returnedMovies3;
                }
                return returnedMovies2;
            }
            
            if (returnedMovies.size() > 3) {
                if (!returnedMovies2.isEmpty()) {
                    if (tempGenGen.equals("Romance")) {
                        genderGenre = "Romance";
                    } else if (tempGenGen.equals("Action")) {
                        genderGenre = "Action";
                    } else if (tempGenGen.equals("Drama")) {
                        genderGenre = "Drama";
                    } else if (tempGenGen.equals("Sci-Fi")) {
                        genderGenre = "Sci-Fi";
                    }
                    return returnedMovies2;
                }
            }
        }
        return returnedMovies;
    }
    
    // The cutDownList method is used to shuffle the returned lists,
    // and if necessary trim them down to 3 objects long:
    public ArrayList<Movie> cutDownList(ArrayList<Movie> theList) {
        ArrayList<Movie> newList = new ArrayList();
        int listSize = theList.size();
        
        Collections.shuffle(theList);
        
        for (int i =0; i < 3; i++) {
            newList.add(theList.get(i));
        }
        
        return newList;
    }
}
