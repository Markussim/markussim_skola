package prime;

public class Prime_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] primes = {2,3};
		
		for (int i = 0; i < 10; i++) {
			int[] newPrimes = new int[primes.length+1];
			int j = 0;
			for(; j<primes.length;j++) {
				newPrimes[j]= primes[j];
			}
			
			newPrimes[j] = 4;
			primes=newPrimes;
		}
		
		for(int prime:primes) {
			System.out.println(prime);
		}
	}

}
