package slutProject;

public class Guesser {
    private static String possessedWord;
    private static String lettersLeft;
    private static String unPossessedWord;

    public Guesser(String theWord) {
        lettersLeft = theWord;
        possessedWord = theWord;
        unPossessedWord = theWord;
    }

    public String printWord() {
        possessWord();
        return possessedWord;
    }

    public String guessLetter(char input) {
        int index = lettersLeft.indexOf(input);
        if (index != -1) {
            System.out.println("That letter exists in the word");
            lettersLeft = lettersLeft.replace(String.valueOf(input), "");
        } else {
            System.out.println("That letter does not exist in the word");
        }
        System.out.println(lettersLeft);
        possessWord();
        return possessedWord;
    }

    private void possessWord() {
        int length = unPossessedWord.length();
        System.out.println(length);
        possessedWord = null;
        for (int i = 0; i < length; i++) {
            if (lettersLeft.contains(String.valueOf(unPossessedWord.charAt(i)))) {
                if (possessedWord == null) {
                    possessedWord = "_";
                } else {
                    possessedWord += " _";
                }
            } else {
                possessedWord += String.valueOf(lettersLeft.charAt(i));
            }
        }
    }
}
