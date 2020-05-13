package leetcode.reversedigits;

public class RunReverseDigits {

	public static void main(String[] args) {
		ReverseDigits rd = new ReverseDigits();
		rd.createTestCase(123, 321);
		rd.createTestCase(-123, -321);
		rd.createTestCase(120, 21);
		
		rd.test();
	}

}
