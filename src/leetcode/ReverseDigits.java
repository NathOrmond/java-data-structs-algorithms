package leetcode;

import java.util.ArrayList;
import java.util.List;

public class ReverseDigits {
	
	//Given a 32-bit signed integer, reverse digits of an integer.
	/**
	 *	Input: 123
	 *	Output: 321
	 *	
	 *	Input: -123
	 *	Output: -321
 	 *
	 *	Input: 120
	 *	Output: 21
	 *
	 * 32-bit signed integer range: [−231,  231 − 1].
	 */
	
	private List<Integer> testInputs = null;
	private List<Integer> testOutputs = null;
	
	public void createTestCase(Integer input, Integer output) { 
		if((testInputs == null) || (testOutputs == null)) { 
			testInputs = new ArrayList<Integer>();
			testOutputs = new ArrayList<Integer>();
		}
		testInputs.add(input);
		testOutputs.add(output);
	}

	public boolean test() { 
		boolean rv  = false;
		
		int index = 0;
		for(Integer testInput : testInputs) { 
			rv = (testOutputs.get(index) == reverse(testInput));
			index++;
			
			System.out.println(String.format("INPUT: %d, EXPECTED: %d, STATUS: %b", testInput, testOutputs.get(index), rv));
			
			if(!rv) { 
				System.out.println(String.format("GOT: %d", reverse(testInput)));
				return rv;
			}
		}
		return rv;
	}

	public int reverse(int input) { 
		//convert input to string
		String inputStr = String.valueOf(input);
		boolean negative = false;
		if(inputStr.contains("-")) { 
			negative = true;
			inputStr.replace("-", "");
		}
		
		//tokenize
		char[] chars = inputStr.toCharArray();
		
		//reverse tokens
		int length;
		
		if(chars.length % 2 == 0) { 
			length = chars.length / 2;
		} else { 
			length = (chars.length - 1) / 2;
		}
		
		//XOR swap algorithm
		for(int index = 0; index < length; index++) { 
			chars[index] = (char) (chars[index] ^ chars[chars.length - index]);
			chars[chars.length - index] = (char) (chars[index] ^ chars[chars.length - index]);
			chars[index] = (char) (chars[index] ^ chars[chars.length - index]);
		}

		int rv = Integer.parseInt(chars.toString());
		//convert reversed tokens to value
		return  negative ? (-1 * rv) : rv;
	}
}
