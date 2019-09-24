package countdown;

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

				System.out.println("Correct");
			}

			else {

				System.out.println("Please input an actual time");
			}
		} else {

			System.out.println("5 characters please");
		}

	}

}
