package maxcontiguoussubsequence;

public class NSquared {
	 static int seqStart, seqEnd;
	 
	 public static int maxSubsequenceSum(int[] a) { 
		 int maxSum = 0;
		 
		 for(int i = 0; i < a.length; i++ ) { 
			 int thisSum = 0;
			 for(int j = i; j < a.length; j++) { 
				 thisSum += a[j];
				 
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
