package kattis;

import java.util.Scanner;

public class Laxa2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String numer = input.nextLine();
		
		int numerLol = Integer.parseInt(numer);
		int lengh = numer.length();
		int totalNumer = 0;
		
		System.out.println("Lengh varieble " + lengh);
		
		for (int i = 0; i < lengh; i++) {
			System.out.println(String.valueOf(Math.abs((long)numerLol)).charAt(i));
			totalNumer += String.valueOf(Math.abs((long)numerLol)).charAt(i) - 48;
		}
		
		System.out.println("The sum is " + totalNumer);
		
		input.close();
	}
}
