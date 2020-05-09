package leetcode.bits;

public class ReverseBits {
	
    // treat n as an unsigned value
    public int reverseBits(int n) {
        int result = 0;
        for(int i=0;i<32;i++){
            result |= (((n >> i)&1)<<(31-i));
        }
        return result;
    }

}
