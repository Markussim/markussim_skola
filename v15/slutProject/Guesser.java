package slutProject;

@SuppressWarnings("StringConcatenationInLoop")
public class Guesser {
    private static String processedWord;
    private static String lettersLeft;
    private static String unProcessedWord;
    private static String guessedLetters = "";

    /**
     * This class is for printing out and controlling the guessing part of hangman
     * @param theWord The word that should be guessed
     */
    public Guesser(String theWord) {
        lettersLeft = theWord;
        processedWord = theWord;
        unProcessedWord = theWord;
        lettersLeft = lettersLeft.replaceAll("[^a-ö]", ""); // This is a regex that selects all characters that's not a-ö
    }

    /**
     * Simply returns the word without guessing anything
     * @return The word
     */
    public String returnWord() {
        processWord();
        return processedWord;
    }

    /**
     * This method is for guessing a letter
     * @param input This is the letter to guess
     * @return The string of the possessed word
     */
    public String guessLetter(char input) {
        if (!guessedLetters.contains(String.valueOf(input))) {
            guessedLetters = guessedLetters.concat(String.valueOf(input));
        }
        int index = lettersLeft.indexOf(input);
        if (index != -1) { // If the index is -1, the search term is not in the string
            System.out.println("That letter exists in the word");
            lettersLeft = lettersLeft.replace(String.valueOf(input), "");
        } else if (unProcessedWord.contains(String.valueOf(input))) {
            System.out.println("You already guessed that letter");
        } else {
            System.out.println("That letter does not exist in the word");
        }
        processWord();
        return processedWord;
    }

    /**
     * This possesses the word
     */
    private void processWord() {
        int length = unProcessedWord.length();
        processedWord = null;
        for (int i = 0; i < length; i++) {
            if (lettersLeft.contains(String.valueOf(unProcessedWord.charAt(i)))) { // This checks every letter to see if it's included in the letters left, if they are they are replaced with an underscore here
                if (processedWord == null) {
                    processedWord = "_";
                } else {
                    processedWord += " _";
                }
            } else {
                if (processedWord == null) {
                    processedWord = unProcessedWord.charAt(i) + "";
                } else {
                    processedWord += " " + unProcessedWord.charAt(i);
                }
            }
        }
    }

    /**
     * Checks if you have won
     * @return Boolean of your winning status
     */
    public boolean checkWin() {
        return lettersLeft.length() == 0;
    }

    /**
     * Returns the word without any possessing
     * @return The word to return
     */
    public String returnPlain() {
        return unProcessedWord;
    }

    /**
     * Returns the letters that you have already guesses
     * @return The letters
     */
    public String lettersGuesses() {
        return guessedLetters;
    }

    /**
     * Resets the guesses letters
     */
    public void resetGuesses() {
        guessedLetters = "";
    }
}
