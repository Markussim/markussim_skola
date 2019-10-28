package methods;

import java.util.Scanner;

public class Metoder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long tal1;
		long tal2;

		Scanner input = new Scanner(System.in);

		System.out.println("Skriv två tal pucko");

		tal1 = input.nextLong();
		tal2 = input.nextLong();
		
		System.out.println(minstaTal(tal1, tal2));
		
		input.close();
	}
	
	/**
	 * Väldigt fint va?
	 * @param tal1
	 * @param tal2
	 * @return Returns the best string you've ever seen
	 */
	static String minstaTal(long tal1, long tal2) {
		if (tal1 <= tal2) {
			System.out.println("Minsta talet är: " + tal1);
		}

		else {
			System.out.println("Minsta talet är: " + tal2);
		}
		
		String hej = "\n" + 
				"\n" + 
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin eget tortor nisi. Duis fermentum nunc vitae sagittis condimentum. Nam nunc ipsum, laoreet a sagittis nec, tristique sed mauris. Donec eget efficitur augue. Donec magna elit, faucibus vel augue sit amet, scelerisque pulvinar ante. Ut eleifend imperdiet lorem, nec euismod eros eleifend sed. Maecenas varius scelerisque orci ut gravida. Nam imperdiet iaculis erat eu sodales. Integer accumsan vitae ex id gravida.\n" + 
				"";
		
		return hej;
	}

}
