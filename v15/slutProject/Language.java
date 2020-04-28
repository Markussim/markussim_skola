package slutProject;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Language {
    private static ArrayList<String> words = new ArrayList<>();
    private static int length;

    public Language(String language) {
        String theLanguage = language + ".txt";
        String line;
        String folder = "v15/slutProject/languages/";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(folder + theLanguage));
            while ((line = reader.readLine()) != null) {
                words.add(line.trim());
            }
        } catch (FileNotFoundException e) {
            System.out.println("That language does not exist");
        } catch (IOException e) {
            e.printStackTrace();
        }
        length = words.size() - 1;

    }

    public String getWord() {
        int random = (int) (Math.random() * length);
        return words.get(random).toLowerCase();
    }
}
