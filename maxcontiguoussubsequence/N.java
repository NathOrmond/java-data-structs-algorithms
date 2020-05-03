package maxcontiguoussubsequence;

public class N {
	
	static int seqStart, seqEnd;
	
	 public static int maxSubsequenceSum(int[] a) { 
		 int maxSum = 0;
		 int thisSum = 0;
		 
		 for(int i = 0, j = 0; j < a.length; j++) { 
			 thisSum += a[j];
			 
			 if(thisSum > maxSum) { 
				 
				 maxSum = thisSum;
				 seqStart = i;
				 seqEnd = j;
				 
			 } else if (thisSum < 0) { 
				 
				 i = j + 1;
				 thisSum = 0;
				 
			 }
			 
		 }
		 
		 return maxSum;
	 }

}
