package leetcode.twosum;

import org.junit.Assert;
import org.junit.Test;

public class TwoSumTest {

	
	/***
	 * Input: numbers = [2,7,11,15], target = 9
	 * Output: [1,2]
	 * Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.
	 */
	
	int[] test1 = {2,7,11,15};
	int target1 = 9;
	int [] expected1 = {1,2};
	
	@Test
	public void test() {
		TwoSum testClass = new TwoSum();
		Assert.assertArrayEquals(expected1, testClass.twoSum(test1, target1));
	}

}
