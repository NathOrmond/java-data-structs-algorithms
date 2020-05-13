package leetcode.maxproduct;

public class MaxProduct {
		
	
	public int maxProduct(int[] nums) {
		
		int[] max = new int[nums.length];
	    int[] min = new int[nums.length];
	 
	    max[0] = min[0] = nums[0];
	    int result = nums[0];
	 
	    for(int i = 1; i < nums.length; i++){
	       
	    	if(nums[i]>0){
	    		
	            max[i]= Math.max(nums[i], max[i-1]*nums[i]);
	            min[i]= Math.min(nums[i], min[i-1]*nums[i]);
	            
	        }else{
	        	
	            max[i]=Math.max(nums[i], min[i-1]*nums[i]);
	            min[i]=Math.min(nums[i], max[i-1]*nums[i]);
	            
	        }
	 
	        result = Math.max(result, max[i]);
	        
	    }
	    
	    
	 
	    return result;
	}
	
	
	
// TODO: Make it go faster	
// -----------------------------------------------------------------------
//	public int maxProduct(int[] nums) {
//
//		if (nums.length == 1) {
//			return nums[0];
//		} 
//		
//		int thisProduct = nums[0];
//		int maxProduct = thisProduct;
//
//		for (int j = 1; j < nums.length; j++) {
//
//			thisProduct = thisProduct * nums[j];
//			
//			if (thisProduct > maxProduct) {
//				maxProduct = thisProduct;
//			} else {
//				thisProduct = nums[j];
//			}
//				
//			
//			int subArrayMaxProduct = maxProduct(getSliceOfArray(nums, j , nums.length)); // recursion
//				
//			if(subArrayMaxProduct > maxProduct) { 
//				maxProduct = subArrayMaxProduct;
//			}else if (nums[j] > maxProduct) {
//					maxProduct = nums[j];
//			} 
//			
//		}
//		
//		return maxProduct;
//	}
//	
//	
//	public static int[] getSliceOfArray(int[] arr, int start, int end) {
//		// Get the slice of the Array 
//		int[] slice = new int[end - start];
//		// Copy elements of arr to slice 
//		for (int i = 0; i < slice.length; i++) {
//			slice[i] = arr[start + i];
//		}
//		// return the slice 
//		return slice;
//	}
	
	
}