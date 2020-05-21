package sorting.analysis;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import sorting.algorithms.ISortingAlgorithm;
import sorting.algorithms.InsertionSort;
import sorting.algorithms.MergeSort;
import sorting.algorithms.QuickSort;
import sorting.algorithms.ShellSort;
import sorting.types.Int;

public class SortingComparator {

	private static int MAX = 9999;
	private static int N;
	
	private Comparable [] set;
	private long startTime;
	private long endTime;
	
	private List<ISortingAlgorithm> sortingAlgorithms;
	private Map<String, List<Map<String, String>>> results;
	
	public SortingComparator(int N, List<ISortingAlgorithm> sortingAlgorithms) {
		SortingComparator.N = N;
		this.sortingAlgorithms = sortingAlgorithms;
		this.results = new HashMap<String, List<Map<String,String>>>();
	}
	
	public Map<String, List<Map<String, String>>> getResults(){ 
		generateSet();
		for(ISortingAlgorithm algorithm : sortingAlgorithms) { 
			testAlgorithm(algorithm);
		}
		return this.results;
	}
	
	private void generateSet() {
		Random rand = new Random();
		Int [] sequence = new Int[N];
		for(int index = 0; index < N; index++) { 
			sequence[index] = new Int(rand.nextInt(MAX));
		}
		set = sequence;
	}
	
	private void testAlgorithm(ISortingAlgorithm algorithm) { 
		Int [] sequence = (Int[]) set;
		startTime = System.nanoTime();
		algorithm.sort(sequence);
		endTime = System.nanoTime();
	}
	

}
