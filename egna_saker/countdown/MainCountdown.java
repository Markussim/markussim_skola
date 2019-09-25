package countdown;

import java.time.LocalTime;
import java.util.Scanner;

public class MainCountdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("When do you want to count down to?");

		String time = input.nextLine();

		if (5 == time.length()) {

			System.out.println(time.substring(0, 2));

			System.out.println(time.substring(3));

			if ((time.substring(3)).matches("[0-9]+") && ((time.substring(0, 2).matches("[0-9]+")))) {

				System.out.println("Correct format");
				
				int timmar = Integer.parseInt(time.substring(0, 2));
				
				int minuter = Integer.parseInt(time.substring(3));
				
				int totalSec = timmar * 3600;
				
				totalSec = totalSec + minuter * 60;
				
				System.out.println(totalSec);
				
			    //String currentTime = java.time.LocalTime.now();
			    
			    //System.out.println(currentTime);
			}

			else {

				System.out.println("Please use format HH:MM");
			}
		} else {

			System.out.println("Please use format HH:MM");
		}

	}

}
