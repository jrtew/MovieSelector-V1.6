package movieselector;

/**
 *
 * @author jrtew
 */

// The Rules class is the "knowledg base" of the rule-based expert system:
public class Rules {

    // The getRuntime method determines the runtime length based on the users
    // choice of radio buttons in the GUI:
    public static int getRuntime(String length) {
        int runLength;

        if (length.equals("short")) {
            runLength = 100;
        } else if (length.equals("medium")) {
            runLength = 135;
        } else {
            runLength = 1000;
        }

        return runLength;
    }

    // The getGenresFromMoods determines which genres will be used to search the
    // movie list based on the user's moods:
    public static String[] getGenresFromMoods(String mood1, String mood2) {
        String genre1 = new String();
        String genre2 = new String();

        if (mood1.equals("Cheerful")) {
            if (mood2.equals("Grumpy")) {
                genre1 = "Comedy";
                genre2 = "Crime";
            } else if (mood2.equals("Stressed")) {
                genre1 = "Comedy";
                genre2 = "Action";
            } else if (mood2.equals("Energetic")) {
                genre1 = "Comedy";
                genre2 = "Sci-Fi";
            } else if (mood2.equals("Peaceful")) {
                genre1 = "Comedy";
                genre2 = "Adventure";
            } else if (mood2.equals("Mad")) {
                genre1 = "Comedy";
                genre2 = "Dark Humor";
            } else if (mood2.equals("Melancholy")) {
                genre1 = "Comedy";
                genre2 = "Romance";
            }
        }

        if (mood1.equals("Happy")) {
            if (mood2.equals("Grumpy")) {
                genre1 = "Adventure";
                genre2 = "Mystery";
            } else if (mood2.equals("Stressed")) {
                genre1 = "Adventure";
                genre2 = "Sci-Fi";
            } else if (mood2.equals("Energetic")) {
                genre1 = "Adventure";
                genre2 = "Epic";
            } else if (mood2.equals("Peaceful")) {
                genre1 = "Adventure";
                genre2 = "Action";
            } else if (mood2.equals("Mad")) {
                genre1 = "Adventure";
                genre2 = "Drama";
            } else if (mood2.equals("Melancholy")) {
                genre1 = "Adventure";
                genre2 = "Fantasy";
            }
        }

        if (mood1.equals("Angry")) {
            if (mood2.equals("Grumpy")) {
                genre1 = "Action";
                genre2 = "Drama";
            } else if (mood2.equals("Stressed")) {
                genre1 = "Action";
                genre2 = "Period";
            } else if (mood2.equals("Energetic")) {
                genre1 = "Action";
                genre2 = "Thriller";
            } else if (mood2.equals("Peaceful")) {
                genre1 = "Action";
                genre2 = "Foreign";
            } else if (mood2.equals("Mad")) {
                genre1 = "Action";
                genre2 = "Mystery";
            } else if (mood2.equals("Melancholy")) {
                genre1 = "Action";
                genre2 = "Crime";
            }
        }

        if (mood1.equals("Good")) {
            if (mood2.equals("Grumpy")) {
                genre1 = "Drama";
                genre2 = "Surreal";
            } else if (mood2.equals("Stressed")) {
                genre1 = "Drama";
                genre2 = "Family";
            } else if (mood2.equals("Energetic")) {
                genre1 = "Drama";
                genre2 = "Dark Humor";
            } else if (mood2.equals("Peaceful")) {
                genre1 = "Drama";
                genre2 = "History";
            } else if (mood2.equals("Mad")) {
                genre1 = "Drama";
                genre2 = "Biography";
            } else if (mood2.equals("Melancholy")) {
                genre1 = "Drama";
                genre2 = "Film-Noir";
            }
        }

        if (mood1.equals("Sad")) {
            if (mood2.equals("Grumpy")) {
                genre1 = "Thriller";
                genre2 = "Surreal";
            } else if (mood2.equals("Stressed")) {
                genre1 = "Thriller";
                genre2 = "Drama";
            } else if (mood2.equals("Energetic")) {
                genre1 = "Thriller";
                genre2 = "Horror";
            } else if (mood2.equals("Peaceful")) {
                genre1 = "Documentary";
                genre2 = "Epic";
            } else if (mood2.equals("Mad")) {
                genre1 = "Action";
                genre2 = "War";
            } else if (mood2.equals("Melancholy")) {
                genre1 = "Thriller";
                genre2 = "Sci-Fi";
            }
        }

        if (mood1.equals("Weird")) {
            if (mood2.equals("Grumpy")) {
                genre1 = "Western";
                genre2 = "Sci-Fi";
            } else if (mood2.equals("Stressed")) {
                genre1 = "Comedy";
                genre2 = "War";
            } else if (mood2.equals("Energetic")) {
                genre1 = "Crime";
                genre2 = "Period";
            } else if (mood2.equals("Peaceful")) {
                genre1 = "Crime";
                genre2 = "Foreign";
            } else if (mood2.equals("Mad")) {
                genre1 = "Crime";
                genre2 = "Thriller";
            } else if (mood2.equals("Melancholy")) {
                genre1 = "Crime";
                genre2 = "Dark Humor";
            }
        }

        // The method returns a list of genres:
        return new String[]{genre1, genre2};
    }

}
