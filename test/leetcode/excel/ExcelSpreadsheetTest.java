package leetcode.excel;


import org.junit.Assert;
import org.junit.Test;


public class ExcelSpreadsheetTest {

	/**
	 * Input: 1
	 * Output: "A"
	 * 
	 * Input: 28
	 * Output: "AB"
	 *
	 * Input: 701
	 * Output: "ZY"
	 */
	
	int input1 = 1;
	String output1 = "A";
	
	int input2 = 28;
	String output2 = "AB";
	
	int input3 = 701;
	String output3 = "ZY";
	
	@Test
	public void test() {
		ExcelSpreadsheet testClass = new ExcelSpreadsheet();
		Assert.assertEquals(output1, testClass.convertToTitle(input1));
		Assert.assertEquals(output2, testClass.convertToTitle(input2));
		Assert.assertEquals(output3, testClass.convertToTitle(input3));
	}

}
