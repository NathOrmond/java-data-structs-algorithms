package leetcode.twosum;

public class TwoSum {

	 public int[] twoSum(int[] list, int target) {
	        
	        int[] rv = new int[2];
	        
	        for(int i = 0; i < list.length; i++){ 
	        
	            for(int j = i + 1; j < list.length; j++){ 
	                
	                if(list[i] + list[j] == target){ 
	                    rv[0] = i + 1;
	                    rv[1] = j + 1;
	                    return rv;
	                }
	                
	            }
	            
	        }
		      return rv; 
	    }
	
}
