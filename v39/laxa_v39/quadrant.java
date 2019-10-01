package laxa_v39;

import java.util.Scanner;

public class quadrant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int x_cord = input.nextInt();
		
		int y_cord = input.nextInt();
		
		if (x_cord > 0) {
			check_1_or_4(y_cord);
		}
		
		else {
			check_2_or_3(y_cord);
		}
		input.close();
	}
	
	public static void check_1_or_4(int y_cord) {
		if (y_cord > 0) {
			System.out.println(1);
		}
		
		else {
			System.out.println(4);
		}
	}
	
	public static void check_2_or_3(int y_cord) {
		if (y_cord > 0) {
			System.out.println(2);
		}
		else {
			System.out.println(3);
		}
	}

}
