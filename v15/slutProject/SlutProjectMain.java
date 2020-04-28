package slutProject;

import java.util.Scanner;

public class SlutProjectMain {
    public static void main(String[] args) {
        Graphics.start();
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please type the language you'd like to play using");

        Language myLanguage;
        Guesser myWord;
        while (true) {
            try {
                myLanguage = new Language(myScanner.nextLine());
                myWord = new Guesser(myLanguage.getWord());
                break;
            } catch (Exception e) {

            }
        }
        while (true) {
            System.out.println(myWord.printWord());
            int guesses = myWord.printPlain().length();
            while (true) {
                try {
                    System.out.println(myWord.guessLetter(myScanner.nextLine().charAt(0)));
                } catch (Exception e) {
                    System.out.println("Something went wrong, please try again");
                }
                System.out.println(Graphics.getMan(guesses));
                System.out.println("Have have guessed the letters: " + myWord.lettersGuesses());
                if (myWord.checkWin()) {
                    System.out.println("You have won, you had " + guesses + " guesses left and the word was \\\"\" + myWord.printPlain() + \"\\\"\"");
                    break;
                }
                if (guesses <= 1) {
                    System.out.println(Graphics.getMan(0));
                    System.out.println("You ran out of lives and therefore lost, the word was \"" + myWord.printPlain() + "\"");
                    break;
                }
                guesses--;
            }
            System.out.println("Do you want to play again? y/n");
            if (myScanner.nextLine().contains("y")) {
                myWord.resetGuesses();
                myWord = new Guesser(myLanguage.getWord());
                continue;
            } else {
                break;
            }
        }
    }
}
