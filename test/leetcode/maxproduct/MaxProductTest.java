package leetcode.maxproduct;

import org.junit.Assert;
import org.junit.Test;

import leetcode.maxproduct.MaxProduct;


public class MaxProductTest {
	
	int[] test1 = {2,3,-2,4};
	int expected1 = 6;
	
	int[] test2 = {-2,0,-1};
	int expected2 = 0;
	
	int[] test3 = {-2};
	int expected3 = -2;
	
	int[] test4 = {0,2};
	int expected4 = 2;
	
	int[] test5 = {-1,-2,-9,-6};
	int expected5 = 108;
	
	int[] test6 = {2,-5,-2,-4,3};
	int expected6 = 24;
	
	private MaxProduct testClass;
	
	
	@Test
	public void testNSquared() {
		testClass = new MaxProduct();
		Assert.assertEquals(expected1, testClass.maxProduct(test1));
		Assert.assertEquals(expected2, testClass.maxProduct(test2));
		Assert.assertEquals(expected3, testClass.maxProduct(test3));
		Assert.assertEquals(expected4, testClass.maxProduct(test4));
		Assert.assertEquals(expected5, testClass.maxProduct(test5));
		Assert.assertEquals(expected6, testClass.maxProduct(test6));
	}

}
