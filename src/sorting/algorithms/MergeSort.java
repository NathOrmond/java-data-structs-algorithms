package sorting.algorithms;

public class MergeSort implements ISortingAlgorithm {
	/**
	 * O(NlogN)
	 * (i)  If the number of items to sort is 0 or 1 return 
	 * (ii) Recursively sort the first and second halves of the array seperately
	 * (iii) Merge the two sorted halves into a sorted group
	 * 
	 * @param a
	 */
	@Override
	public void sort(Comparable[] a) {
		Comparable[] tmpArray = new Comparable[a.length];
		sort(a, tmpArray, 0, (a.length - 1));
	}

	public static void sort(Comparable[] a, Comparable[] tmpArray, int left, int right) {
		if (left < right) {
			int center = (left + right) / 2;
			sort(a, tmpArray, left, center);
			sort(a, tmpArray, center + 1, right);
			merge(a, tmpArray, left, center + 1, right);
		}
	}

	public static void merge(Comparable[] a, Comparable[] tmpArray, int leftPos, int rightPos, int rightEnd) {
		int leftEnd = rightPos - 1;
		int tmpPos = leftPos;
		int numElements = rightEnd - leftPos + 1;

		while ((leftPos <= leftEnd) && (rightPos <= rightEnd)) {
			if (a[leftPos].compareTo(a[rightPos]) < 0) {
				tmpArray[tmpPos++] = a[leftPos++];
			} else {
				tmpArray[tmpPos++] = a[rightPos++];
			}
		}
		while (leftPos <= leftEnd) {
			tmpArray[tmpPos++] = a[leftPos++];
		}
		while (rightPos <= rightEnd) {
			tmpArray[tmpPos++] = a[rightPos++];
		}
		for (int i = 0; i < numElements; i++, rightEnd--) {
			a[rightEnd] = tmpArray[rightEnd];
		}
	}

	@Override
	public String getAlgorithmName() {
		return "Merge Sort";
	}

}
