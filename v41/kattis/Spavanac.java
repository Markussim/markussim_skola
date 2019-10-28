package kattis;

//import java.time.LocalTime;

import java.util.Scanner;

public class Spavanac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int hour = input.nextInt();
		//System.out.println(hour);
		int minute = input.nextInt();
		//System.out.println(minute);
		
		/*LocalTime time = LocalTime.of(hour, minute);
		
		System.out.println(time.minusMinutes(45));
		*/

		System.out.println(hour+", "+minute);
		input.close();

	}

}
