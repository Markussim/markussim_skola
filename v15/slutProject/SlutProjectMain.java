package slutProject;

import java.util.Scanner;

public class SlutProjectMain {
    public static void main(String[] args) {
        Language myLanguage = new Language("swedish");

        Guesser myWord = new Guesser(myLanguage.getWord());
        Scanner myScanner = new Scanner(System.in);
        myWord.printWord();
        while (true) {
            System.out.println(myWord.guessLetter(myScanner.nextLine().charAt(0)));
        }

    }
}
