package randomisation;

public class PoissonDistribution {
	
	public int nextPoisson(double expectedValue) { 
		double limit = -expectedValue;
		double product = Math.log(nextDouble());
		int count;
		
		for(count = 0; product > limit; count++) { 
			product += Math.log(nextDouble());
		}
		
		return count;
	}

	private double nextDouble() {
		return 0;
	}

}
