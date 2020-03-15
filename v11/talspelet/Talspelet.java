package talspelet;

import java.util.Scanner;

public class Talspelet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Sets up a scanner

        boolean finnished = false;

        while (!finnished) {

            int high = 100; //Defines varibles
            int low = 0;

            int lives = 10; //Defines the number of lives, eg. how many times you can try

            try {
                System.out.println("Type highest and lowest numbers you'd like to guess in that order");
                high = input.nextInt();
                low = input.nextInt();
            } catch (Exception e) {
                System.out.println("As you did not enter a correct number, default values of 0-100 have been set");
            }

            try {
                System.out.println("Type how many lives you'd like");
                lives = input.nextInt();
            } catch (Exception e) {
                System.out.println("As you did not enter a correct number, default values of 10 lives have been set");
            }

            int correct = (int) ((Math.random() * ((high - low) + 1)) + low); //Gets a random number that the user can later guess

            boolean isWinner = false; //This variable is used the stop the loop as it defines if the user has won yet

            while (!isWinner){ //This loop runs almost everything in the program that needs to be repeated, for example guessing a number

                if (lives < 1) { //The first thing the loop does is to check if you have lost. Losing is having too few lives and tells you that you died and also tells you the number you tried to guess, but failed to guess
                    System.out.println("You died.");
                    System.out.println(correct);
                    System.exit(0); //It then exits the program. No need to play again if you're this bad at it
                }

                System.out.println("Pick a number"); //This tells you to pick and number and tells you how many lives you have left
                System.out.println("You have " + lives + " lives left");

                int guess = 0; //This variable need to be something, even though this value is never used

                try { //A try catch is used to prevent the program from crashing when a non-int value is entered
                    guess = input.nextInt(); //Gets a number from the user
                } catch (Exception e) { //This runs if the scanner didn't succeed
                    System.out.println("Please enter a number"); //It tells you to enter a number as it can be expected that that is what went wrong
                    input.nextLine(); //Goes to the next line to prevent a loop
                    lives += -1; //Removes a life because you need to be punished
                    continue; //Goes back to the front of the loop
                }

                if (guess > correct) { //If the guess is too high, it tells you so
                    System.out.println("Guess is too high");
                    lives--; //It removes a life because you need to be punished
                    continue;
                }

                else if (guess < correct) { //If the guess is too low, it tells you so
                    System.out.println("Guess is too low");
                    lives--; //It removes a life because you need to be punished
                    continue;
                }

                else { //If it isn't too low or too high it has to be correct, so it makes the variable true
                    System.out.println("You have won, would you like to play again? Type yes to play again, or anything else for no");
                    input.nextLine(); //Takes input
                    String play_again = input.nextLine(); //Sets string to input
                    if (play_again.contains("yes")) { //If it contains yes, play the game again
                        finnished = false;
                    }
                    else {
                        finnished = true;
                    }
                    isWinner = true;
                }
        }
        }
    }
}
