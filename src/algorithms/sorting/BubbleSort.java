package algorithms.sorting;

public class BubbleSort {

	public static void bubblesort(Comparable[] a) {
		int n = a.length;
		for (int index = 0; index < (n - 1); index++) {
			for (int j = 0; j < n - index - 1; j++)
				if (a[j].compareTo(a[j + 1]) < 0) {
					Comparable temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
		}

	}

}
