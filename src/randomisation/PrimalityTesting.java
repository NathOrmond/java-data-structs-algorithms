package randomisation;

public class PrimalityTesting {
	
	/**
	 * Primality testing by trial diviision
	 * @param n
	 * @return
	 */
	public static boolean isPrime(long n) { 
		boolean prime = true;
		for(int i = 3; i * i <= n; i +=2) { 
			if(n % i == 0) { 
				return !prime; 
			}
		}
		return prime;
	}
	

}
