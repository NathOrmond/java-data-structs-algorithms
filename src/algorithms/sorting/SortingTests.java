package algorithms.sorting;

import java.util.Arrays;
import java.util.Random;

public class SortingTests {

	public static int MAX = 9999;
	public static int N = 100000;
	
	static Comparable [] set;
	private static long startTime;
	private static long endTime;
	
	public static void main(String[] args) {
		generateSet();
		testInsertionSort();
		testShellSort();
		testMergeSort();
		testQuickSort();
	}
	
	public static void generateSet() {
		Random rand = new Random();
		Int [] sequence = new Int[N];
		for(int index = 0; index < N; index++) { 
			sequence[index] = new Int(rand.nextInt(MAX));
		}
		
		set = sequence;
		//System.out.println(String.format("Array Generated:     %s", Arrays.toString(set)));
		}
	
	public static void testInsertionSort() { 
		InsertionSort sort = new InsertionSort();
		Int [] sequence = (Int[]) set;
		startTime = System.nanoTime();
		sort.insertionSort(sequence);
		endTime = System.nanoTime();
		//System.out.println(String.format("Insertion Sort:      %s", Arrays.toString(sequence)));
		System.out.println(String.format("Insertion Sort Duration: %s", String.valueOf(endTime - startTime)));
	}
	
	public static void testShellSort() { 
		ShellSort sort = new ShellSort();
		Int [] sequence = (Int[]) set;
		startTime = System.nanoTime();
		sort.shellsort(set);
		endTime = System.nanoTime();
		//System.out.println(String.format("Shell Sort:          %s", Arrays.toString(sequence)));
		System.out.println(String.format("Shell Sort Duration: %s", String.valueOf(endTime - startTime)));
	}
	
	public static void testMergeSort() { 
		MergeSort sort  = new MergeSort();
		Int [] sequence = (Int[]) set;
		startTime = System.nanoTime();
		sort.mergesort(set);
		endTime = System.nanoTime();
		//System.out.println(String.format("Merge Sort:          %s", Arrays.toString(sequence)));
		System.out.println(String.format("Merge Sort Duration: %s", String.valueOf(endTime - startTime)));
	}
	
	public static void testQuickSort() { 
		QuickSort sort  = new QuickSort();
		Int [] sequence = (Int[]) set;
		startTime = System.nanoTime();
		sort.quicksort(set);
		endTime = System.nanoTime();
		//System.out.println(String.format("Quick Sort:          %s", Arrays.toString(sequence)));
		System.out.println(String.format("Quick Sort Duration: %s", String.valueOf(endTime - startTime)));
	}

}
