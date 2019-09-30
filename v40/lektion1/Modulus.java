package lektion1;

public class Modulus {
	public static void main(String[] args) {
	
		int tal1 = 47;
		
		int tal2 = 19;
		
		int tal3 = 69;
		
		int tal4 = -137;
				
		int sum = 0;
		
		for (int i = 0; i < 10000001; i++) {
			if (i % 3 == 0) {
				System.out.println("Talet " + i + " är delbart med 3");
				
				sum += i;
			}
		}
		
		System.out.println(sum);
	}
	
}
