package randomisation;

public class NegativeExponentialDistribution {
	
	public double nextNegExp(double expectedValue) { 
		return -expectedValue * Math.log(nextDouble());
	}

	private double nextDouble() {
		return 0;
	}

}
