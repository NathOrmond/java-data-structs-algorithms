package algorithms.sorting;

public class QuickSort {
	
	private static int CUTOFF = 5;

	/**
	 * (i)   If number of elements is 0 or 1 then return
	 * (ii)  Pick any element v (called the pivot)
	 * (iii) Partition the collection - v into two sets:
	 * 										L = { x is an element of collection -v | x <= v }
	 * 										R = { x is an element of collection -v | x >= v }
	 * (iv)  return the result of Quicksort(L) followed by v followed by Quicksort(R)
	 */
	public static void quicksort(Comparable [] a) { 
		quicksort(a, 0, a.length -1);
	}
	
	public static void quicksort(Comparable [] a, int low, int high) { 
		if(low + CUTOFF > high) {
			InsertionSort sort = new InsertionSort();
			sort.insertionSort(a);
		}else { 
			
			int middle = (low + high) /2;
			if(a[middle].compareTo(a[low]) < 0) { 
				swapReferences(a, low, middle);
			}
			if(a[high].compareTo(a[low]) < 0) { 
				swapReferences(a, low, high);
			}
			if(a[high].compareTo(a[middle]) < 0) { 
				swapReferences(a, middle, high);
			}
			
			swapReferences(a, middle, high - 1);
			Comparable pivot = a[high - 1];
			
			int i,j;
			for(i = low, j = high; ;) { 
				while(a[++i].compareTo(pivot) < 0) { 
					;
				}
				
				while(pivot.compareTo(a[--j]) < 0) { 
					;
				}
				
				if(i >= j) { 
					break;
				}
				
				swapReferences(a, i, j);
			}
			
			swapReferences(a, i, high -1);
			
			quicksort(a, low, i - 1);	// sort small elements
			quicksort(a, i + 1, high);	// sort large elements
			
			
		}
	}

	private static void swapReferences(Comparable[] a, int num1, int num2) {
		Comparable tmp = a[num1];
		a[num1] = a[num2];
		a[num2] = tmp;
	}
	
}
