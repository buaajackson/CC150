package year2016;

public class DecodeWays {
    public int numDecodings(String s) {
        if(s == null || s.length() == 0 || s.equals("0"))
        	return 0;
        
        if(s.length() == 1)
        	return 1;
        
        int[] num = new int[s.length()+1];
        num[0] = 1;
        
        for(int i = 2; i < s.length(); i++){
        	if(isValid(s.substring(i, i+1))){
        	    num[i] += num[i-1];
        	}
        	if(isValid(s.substring(i-1, i+1))){
        		num[i] = num[i-1] + num[i-2];
        	}
        }
        
        return num[s.length()];
    }
    
    private boolean isValid(String s){
    	int n = Integer.parseInt(s);
    	if(n > 0 && n <= 26)
    		return true;
    	else
    		return false;
    }
}
