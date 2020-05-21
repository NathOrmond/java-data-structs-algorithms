package randomisation;

import java.util.Random;

public class RandomPermutation {

	/**
	 * N! possible permutations
	 */
	
	public static final void permute(Object [] a) { 
		Random r = new Random();
		for(int j =1; j < a.length; j++) { 
			swapReferences(a, j, r.nextInt(j));
		}
	}

	private static void swapReferences(Object[] a, int j, int nextInt) {
		//TODO
	}
	
}
