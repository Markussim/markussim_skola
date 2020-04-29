package slutProject;

import java.util.Scanner;

public class SlutProjectMain {
    public static void main(String[] args) {
        Graphics.start(); // See javadoc
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please type the language you'd like to play using");

        Language myLanguage; // Creates objects so they can be accesed outside of catch statement
        Guesser myWord;
        while (true) {
            try {
                myLanguage = new Language(myScanner.nextLine()); // See javadoc
                myWord = new Guesser(myLanguage.getWord());
                break;
            } catch (Exception ignored) {
            }
        }
        while (true) {
            System.out.println(myWord.returnWord());
            int guesses = 10;
            while (true) {
                try {
                    System.out.println(myWord.guessLetter(myScanner.nextLine().charAt(0))); // Gets the first letter from your input and guesses it
                } catch (Exception e) {
                    System.out.println("Something went wrong, please try again");
                }
                System.out.println(Graphics.getMan(guesses)); // Prints the man being hanged
                System.out.println("Have have guessed the letters: " + myWord.lettersGuesses());
                if (myWord.checkWin()) {
                    System.out.println("You have won, you had " + guesses + " guesses left and the word was \\\"\" + myWord.printPlain() + \"\\\"\"");
                    break;
                }
                if (guesses <= 1) { // If you lost, it prints that man being completely hanged
                    System.out.println(Graphics.getMan(0));
                    System.out.println("You ran out of lives and therefore lost, the word was \"" + myWord.returnPlain() + "\"");
                    break;
                }
                guesses--;
            }
            System.out.println("Do you want to play again? y/n");
            if (myScanner.nextLine().contains("y")) {
                myWord.resetGuesses();
                myWord = new Guesser(myLanguage.getWord());
            } else {
                break;
            }
        }
    }
}
