package kattis;

import java.util.Scanner;

public class FizzBuzz {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		int y = input.nextInt();
		int n = input.nextInt();
		
		for (int i = 1; i < n + 1; i++) {
			boolean noneFuzz = true;
			if (i % x == 0) {
				System.out.print("Fizz");
				noneFuzz = false;
			}
			if (i % y == 0 ) {
				System.out.print("Buzz");
				noneFuzz = false;
			}
			if (noneFuzz == true) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		input.close();
	}
}