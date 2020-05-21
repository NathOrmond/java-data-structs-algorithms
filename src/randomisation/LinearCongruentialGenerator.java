package randomisation;

public class LinearCongruentialGenerator {

	/**
	 * Linear Congruential Generator Algorithm
	 * seed: X(0) = 0
	 * X(i+1) = AX(i)(modM)
	 * x[i + 1] = A * x[i] % M
	 * 
	 * The period of the sequence:
	 * Sequence repeats after M-1 numbers
	 * 
	 * Full period for 31 bit integer:
	 * M = 2^31
	 * A = 48271
	 */
	
	private static final int A = 48271;	
	private static final int M = 2147483647;
	private static final int Q = M / A;
	private static final int R = M % A;
	public int state;
					
	public LinearCongruentialGenerator(int initialValue) { 
		if(initialValue < 0) { 
			initialValue += M;
		}
		state = initialValue;
		if(state == 0) { 
			state = 1;
		}
	}
	
	public int nextInt() { 
		int tmpState = A * (state % Q) - R * (state / Q);
		if(tmpState >= 0) { 
			state = tmpState;
		} else { 
			state = tmpState + M;
		}
		return state;
	}
	
}
