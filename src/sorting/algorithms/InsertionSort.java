package sorting.algorithms;

public class InsertionSort implements ISortingAlgorithm {
	/**
	 * Ave Case: Quadratic Time
	 * 
	 * @param a list of comparable objects
	 */
	@Override
	public void sort(Comparable[] a) {
		for (int p = 1; p < a.length; p++) {
			Comparable tmp = a[p];
			int j = p;
			for (; (j > 0) && (tmp.compareTo(a[j - 1]) < 0); j--) {
				a[j] = a[j - 1];
			}
			a[j] = tmp;

		}
	}

	@Override
	public String getAlgorithmName() {
		return "Insertion Sort";
	}

}
