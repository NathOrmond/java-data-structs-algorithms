package sorting.analysis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import sorting.algorithms.ISortingAlgorithm;
import sorting.algorithms.InsertionSort;
import sorting.algorithms.MergeSort;
import sorting.algorithms.QuickSort;
import sorting.algorithms.ShellSort;

public class SortingSizesTest {
	
	private List<ISortingAlgorithm> sortingAlgorithms;
	private Map<String, List<Map<String, String>>> results;
	private int lower, upper;
	
	public SortingSizesTest(int lower, int upper) {
		this.lower = lower;
		this.upper = upper;
		this.results = new HashMap<String, List<Map<String,String>>>();
		sortingAlgorithms = new ArrayList<ISortingAlgorithm>();
		sortingAlgorithms.add(new InsertionSort());
		sortingAlgorithms.add(new ShellSort());
		sortingAlgorithms.add(new MergeSort());
		sortingAlgorithms.add(new QuickSort());
	}

	public Map<String, List<Map<String, String>>> getResults(){ 
		SortingComparator comparator;
		for(; lower < upper; lower++) { 
			comparator = new SortingComparator(lower, this.sortingAlgorithms);
		}
		return this.results;
	}
	
	private void mergeResults(Map<String, List<Map<String, String>>> results) { 
		for(String key : results.keySet()) {
			
			if(this.results.keySet().contains(key)) { 
				//TODO add to existing entry
			} else { 
				//TODO add new entry
			}
		}
	}
	
}
