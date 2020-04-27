package slutProject;

import java.util.Scanner;

public class SlutProjectMain {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please type the language you'd like to play using");

        Language myLanguage = null;
        Guesser myWord = null;
        while (true) {
            try {
                myLanguage = new Language(myScanner.nextLine());
                myWord = new Guesser(myLanguage.getWord());
                break;
            } catch (Exception e) {
                //
                // myScanner.nextLine();
            }
        }
        System.out.println(myWord.printWord());
        int guesses = myWord.printPlain().length();
        while (true) {
            System.out.println(guesses);
            try {
                System.out.println(myWord.guessLetter(myScanner.nextLine().charAt(0)));
            } catch (Exception e) {
                System.out.println("Something went wrong, please try again");
            }

            if (myWord.checkWin()) {
                System.out.println("You have won, you had " + guesses + " guesses left");
                break;
            }
            if (guesses <= 1) {
                System.out.println("You ran out of lives and therefore lost, the word was \"" + myWord.printPlain() + "\"");
                break;
            }
            guesses--;
        }

    }
}
