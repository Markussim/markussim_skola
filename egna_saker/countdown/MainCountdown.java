//package countdown;
/*
import java.time.LocalTime;
import java.util.Scanner;

public class MainCountdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		Scanner input = new Scanner(System.in);

		//System.out.println("When do you want to count down to?");
		String time = "23:59";
			try {
				time = args[0];
			}
			catch(Exception e) {
				System.out.println("Skiv något");
			}

		if (5 == time.length()) {
			if ((time.substring(3)).matches("[0-9]+") && ((time.substring(0, 2).matches("[0-9]+")))) {

				int timmar = Integer.parseInt(time.substring(0, 2));

				int minuter = Integer.parseInt(time.substring(3));

				int totalSec = timmar * 3600;

				totalSec = totalSec + minuter * 60;

				while (true ) {
					the_actual_countdown(totalSec);
					try {
						Thread.sleep(10);
					}

					catch (Exception e) {
						// TODO: handle exception
					}
				}
			}

			else {

				System.out.println("Please use format HH:MM");
			}
		} else {

			System.out.println("Please use format HH:MM");
		}
		input.close();
	}

	public static void the_actual_countdown(int totalSec) {

		LocalTime currentTime_local = java.time.LocalTime.now();

		String currentTime = currentTime_local.toString();

		int currentTimmar = Integer.parseInt(currentTime.substring(0, 2));

		int currentMinuter = Integer.parseInt(currentTime.substring(3).substring(0, 2));

		int currentSekunder = Integer.parseInt(currentTime.substring(6).substring(0, 2));

		int currentTotalSec = currentTimmar * 3600;

		currentTotalSec = currentSekunder + currentTotalSec + currentMinuter * 60;

		int doneTime = totalSec - currentTotalSec;

		System.out.println(doneTime/60);
		System.out.println(doneTime);
		//Runtime.getRuntime().exec("cls");

	}

}

*/