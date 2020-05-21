package sorting.algorithms;

public class Duplicates {
	
	/**
	 * Worst case algorithm for finding duplicates in an array
	 * @param a (Object with a comparable interface)
	 * @return if contains duplicates then true
	 */
	public static boolean duplicates(Object[] a) { 
		for(int i = 0; i < a.length; i++) { 
			for(int j = i + 1; j < a.length; j++) { 
				if(a[i].equals(a[j])) { 
					return true; // duplicate found
				}
			}
		}
		return false;
	}

}
