package lektion2;

public class Aktaloop {

	public static void main(String[] args) {
		int i = 0;
		String fint = "fint";
		while (true) {
			String prevChar = Integer.toString(i);

			if (!fint.equals(String.valueOf(prevChar.charAt(0)))) {
				fint = String.valueOf(prevChar.charAt(0));
				
				System.out.println(prevChar.charAt(0));
				//slp();
			}

			i++;
		}
	}

	public static void slp() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}