package movieselector;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 *
 * @author jrtew
 */
public class XMLQuery {
    // This method creates a movie object for each movie in the XML database:
    public ArrayList getMovieInfo() throws DocumentException, FileNotFoundException {
        
        SAXReader reader = new SAXReader();
        final String xmlPath = "resources\\movieDatabase.xml";
//        String xmlFilePath = System.getProperty("os.name").contains("Windows") ? System.getProperty("user.dir") + "\\lib\\movieDatabase.xml"
//                : System.getProperty("user.dir") + "/movieDatabase.xml";
        Document doc = reader.read(XMLQuery.class.getResourceAsStream("movieDatabase.xml"));
        
        // movieObjList is the array list of movie objects created from the XML db:
        ArrayList<Movie> movieObjList = new ArrayList();
        ArrayList<String> tempGs;
        String tempAwards;
        String tempColor;
        String tempTitle;
        
        // Create a list of movie nodes:
        List movieElements = doc.selectNodes("//movie");
        // Iterate through each movie node:
        for (Iterator i = movieElements.iterator(); i.hasNext();) {
            tempGs = new ArrayList();
            try {
                Element movies = (Element) i.next();
                for (Iterator j = movies.elementIterator(); j.hasNext();) {
                    Element movieElement = (Element) j.next();
                    if (movieElement.getName().equals("genres")) {
                        for (Iterator k = movieElement.elementIterator(); k.hasNext();) {
                            Element genre = (Element) k.next();
                            tempGs.add(genre.getText());
                        }
                    }
                }
                if (movies.selectSingleNode("released").hasContent()) {
                    int actReleased = Integer.parseInt(movies.selectSingleNode("released").getText());
                    if (movies.selectSingleNode("runtime").hasContent()) {
                        int actRuntime = Integer.parseInt(movies.selectSingleNode("runtime").getText());
                        if (movies.selectSingleNode("imdbscore").hasContent()) {
                            double actScore = Double.parseDouble(movies.selectSingleNode("imdbscore").getText());
                            if (movies.selectSingleNode("awards").hasContent()) {
                                if (movies.selectSingleNode("color").hasContent()) {
                                    tempColor = movies.selectSingleNode("color").getText();
                                    tempTitle = movies.selectSingleNode("title").getText();
                                    tempAwards = movies.selectSingleNode("awards").getText();
                                    // Create the movie object with all of the parameters:
                                    Movie tempMovie = new Movie(tempTitle, tempGs, actReleased, actRuntime, actScore, tempAwards, tempColor);
                                    movieObjList.add(tempMovie);
                                }
                            }
                        }
                    }
                }
            } catch (NumberFormatException ex) {
                System.out.println(ex);
            }
        }
        // This method returns an array list of movie objects: 
        return movieObjList;
    }
    
}