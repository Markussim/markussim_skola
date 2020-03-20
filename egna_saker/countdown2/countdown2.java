package countdown2;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class countdown2 {
    public static void main(String[] args) {
        LocalTime hoursAndMinutes; //Initialises a localtime
        try { //If the arguments aren't empty, use that
            hoursAndMinutes = setLocalTime(args[0]);
        } catch (Exception e){
            hoursAndMinutes = setLocalTime(get_a_string());
        }

        while (true) {
            System.out.println(LocalTime.now().until(hoursAndMinutes, ChronoUnit.SECONDS));
        }
    }

    public static LocalTime setLocalTime(String someTextWithTime) {

        int hours = Integer.parseInt(someTextWithTime.substring(0, 2));
        int minutes = Integer.parseInt(someTextWithTime.substring((someTextWithTime.length() - 2)));

        LocalTime hoursAndMinutes = LocalTime.of(hours, minutes); //Sets hours and minutes to an object in the LocalTime class

        return hoursAndMinutes;
    }
    public static String get_a_string() { //Get input from user and turns it into a string
        Scanner input = new Scanner(System.in); //Initialises a scanner
        String input_string;
        while (true) {
            try {
                System.out.println("When do you which to count down to? Please enter time in HH space MM format");
                input_string = input.nextLine();
                break;
            } catch (Exception e){
                System.out.println("Please enter correct time");
                input.nextLine();
            }
        }
        return input_string;
    }
}
