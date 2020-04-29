package slutProject;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Language {
    private static ArrayList<String> words = new ArrayList<>();
    private static int length;

    /**
     * Creates on object that includes a list of possible words
     * @param language This is the language you'd like to play
     */
    public Language(String language) {
        String theLanguage = language + ".txt";
        String line;
        String folder = "v15/slutProject/languages/"; // This is very hard coded, but i don't know how to do it any other way
        try {
            BufferedReader reader = new BufferedReader(new FileReader(folder + theLanguage));
            while ((line = reader.readLine()) != null) {
                words.add(line.trim()); // This adds every line of the file to an array, and trims it
            }
        } catch (FileNotFoundException e) {
            System.out.println("That language does not exist");
        } catch (IOException e) {
            e.printStackTrace();
        }
        length = words.size() - 1; // Indexes start at 0

    }

    /**
     * This gets a word from the list of words
     * @return The word
     */
    public String getWord() {
        int random = (int) (Math.random() * length);
        return words.get(random).toLowerCase();
    }
}
