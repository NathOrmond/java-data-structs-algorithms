package randomisation;

import java.util.Random;

public class RandomisedPrimalityTesting {
	
	public static final int TRIALS = 5;

	public static boolean isPrime(long n) { 
		Random r = new Random();
		boolean prime = true;
		for(int count = 0; count < TRIALS; count++) { 
			if(witness(r.nextInt((int) n - 3) +2, n-1, n) != 1) { 
				return !prime;
			}
		}
		return prime;
	}
	
	private static long witness(long a, long i, long n) { 
		if(i ==0) { 
			return 1;
		}
		long x = witness(a, i/2, n);
		if(x == 0) { 
			return 0;
		}
		long y = (x * x) % n;
		if(y==1 && x!=1 && x!=(n-1)) { 
			return 0;
		}
		if(i%2 != 0) { 
			y = (a*y) % n;
		}
		return y;
	}
	
}
