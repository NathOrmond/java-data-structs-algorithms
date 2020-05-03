package maxcontiguoussubsequence;

public class NCubed {
	
	static int seqStart;
	static int seqEnd;
	
	public static int maxSubSequenceSum(int[] a) { 
		int maxSum = 0;
		
		for(int i = 0; i < a.length; i++) { 
			for(int j = i; j < a.length; j++) { 
				
				int thisSum = 0;
				
				for(int k = i; k <= j; k++) {
					thisSum += a[k];
				}
				
				if(thisSum > maxSum) { 
					maxSum = thisSum;
					seqStart = i; 
					seqEnd = j;
				}
				
			}
		}
		
		return maxSum;
	}

}
