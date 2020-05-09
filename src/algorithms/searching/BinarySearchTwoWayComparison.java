package algorithms.searching;

public class BinarySearchTwoWayComparison {
	
private static final int NOT_FOUND = -1;
	
	public static int binarySearch(Comparable[] list, Comparable target) { 
		
		if(list.length == 0) { 
			return NOT_FOUND;
		}
		
		int low = 0;
		int high = list.length - 1;
		int mid;
		
		while(low <= high) { 
			mid = (low + high)/2;
			
			if(list[mid].compareTo(target) < 0) { 
				low = mid + 1;
			}else { 
				high = mid;
			}
			
		}
		
		if(list[low].compareTo(target) == 0) { 
			return low;
		}
		
		return NOT_FOUND;
	}

}
