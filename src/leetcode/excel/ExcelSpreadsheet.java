package leetcode.excel;

public class ExcelSpreadsheet {
	
	public String convertToTitle(int n) {
        char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        
        StringBuffer sb = new StringBuffer();
        
        while(n>0){
            int mod = (n-1)%26;
            sb.append(alphabet[mod]);
            n=(n-mod)/26;
        }
        
        return sb.reverse().toString();
    }

}
