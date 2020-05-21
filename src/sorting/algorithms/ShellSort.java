package sorting.algorithms;

public class ShellSort implements ISortingAlgorithm {

	@Override
	public void sort(Comparable[] a) {
		for (int gap = (a.length / 2); gap > 0; gap = (gap == 2) ? 1 : (int) (gap / 2.2)) {

			for (int i = gap; i < a.length; i++) {
				Comparable tmp = a[i];
				int j = i;

				for (; (j >= gap) && (tmp.compareTo(a[j - gap]) < 0); j -= gap) {
					a[j] = a[j - gap];
				}

				a[j] = tmp;
			}

		}
	}

	@Override
	public String getAlgorithmName() {
		return "Shell Sort";
	}

}
