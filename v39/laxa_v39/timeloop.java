//package laxa_v39;

import java.util.Scanner;

public class timeloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
				
		String number_string = input.nextLine();
		
		if (number_string.matches("[0-9]+")) {
			
			int number_int = Integer.parseInt(number_string);
			
			number_int++;
			
			for(int i = 1; i < number_int; i++) {
				
				System.out.println(i + " Abracadabra");
			}
		}
		
		else {
			
			System.out.println("Please input a number, that's what kattis said you should");
		}
	}

}
