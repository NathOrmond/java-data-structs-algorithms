package leetcode.maxcontiguousproduct;

public class MaxContiguousProduct {
	
	/*****
	 * Example Cases:
	 * 
	 * In: [2,3,-2,4]
	 * Out: 6
	 * 
	 * In: [-2,0,-1]
	 * Out: 0
	 * 
	 * In: [-2]
	 * Out: -2
	 * 
	 * In: [0,2]
	 * Out: 2
	 * 
	 * In: [-1,-2,-9,-6]
	 * Out: 108
	 * 
	 */
	

	public int maxProduct(int[] nums) {

		if (nums.length == 1) {
			return nums[0];
		}

		int maxProduct = Integer.MIN_VALUE;
		int thisProduct = nums[0];

		for (int i = 1, j = 1; j < nums.length; j++) {

			thisProduct = thisProduct * nums[j];
			if (thisProduct > maxProduct) {
				maxProduct = thisProduct;
			} else {

				i = j + 1;
				thisProduct = nums[j];

			}

			if (nums[j] > maxProduct) {
				maxProduct = nums[j];
			}

		}
		return maxProduct;
	}

}
