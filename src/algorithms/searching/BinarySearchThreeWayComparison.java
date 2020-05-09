package algorithms.searching;

public class BinarySearchThreeWayComparison {
	
	private static final int NOT_FOUND = -1;
	
	public static int binarySearch(Comparable[] list, Comparable target) { 
		
		int low = 0;
		int high = list.length - 1;
		int mid;
		
		while(low <= high) { 
			mid = (low + high)/2;
			
			if(list[mid].compareTo(target) < 0) { 
				low = mid + 1;
			}else if(list[mid].compareTo(target) > 0) { 
				high = mid - 1;
			}else { 
				return mid;
			}
		}
		
		return NOT_FOUND;
	}

}
