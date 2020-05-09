package algorithms.searching;

public class SequentialSearch {
	
	private static final int NOT_FOUND = -1;
	
	public static int sequentialSearch(Comparable[] list, Comparable target) { 
		
		for(int index = 0; index < list.length; index++) { 
			if(list[index].compareTo(target) == 0) { 
				return index;
			}
		}
		
		return NOT_FOUND;
	}

}
