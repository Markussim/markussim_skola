
package talspelet;

import java.util.Scanner;

public class talspelet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int high = 100;
        int low = 0;

        int lives = 10;

        int correct = (int) ((Math.random() * ((high - low) + 1)) + low);

        boolean isWinner = false;

        while (!isWinner){
            if (lives < 1) {
                System.out.println("You died.");
                System.out.println(correct);
                System.exit(0);
            }

            System.out.println("Pick a number");
            System.out.println("You have " + lives + " lives left");

            int guess = 0;

            try {
                guess = input.nextInt();
            } catch (Exception e) {
                System.out.println("Please enter a number");
                input.nextLine();
                lives += -1;
                continue;
            }
            if (guess > correct) {
                System.out.println("Guess is too high");
                lives--;
                continue;
            }
            else if (guess < correct) {
                System.out.println("Guess is too low");
                lives--;
                continue;
            }
            else {
                isWinner = true;
            }
        }
        System.out.println("Correct number!");
    }
}
