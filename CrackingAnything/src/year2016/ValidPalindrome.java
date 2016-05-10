package year2016;

public class ValidPalindrome {
   public boolean isPalindrome(String s) {
        if(s == null || s.length() == 0)
        	return true;
        
        s = s.toLowerCase();
        int start = 0; 
        int end = s.length() - 1;
        
        while(start <= end){
        	while(start >= 0 && start < s.length() && !findNextValid(start, s)){
        		start++;
        	}
        	
        	while(end >= 0 && end < s.length() && !findNextValid(end, s)){
        		end--;
        	}
        	
        	if(start <= end && s.charAt(start) != s.charAt(end)){
        		return false;
        	}
        	start++;
        	end--;
        }
        return true;
    }
    
    private boolean findNextValid(int index, String s){
		char temp = s.charAt(index);
		if((temp >= '0' && temp <= '9') || (temp >= 'a' && temp <= 'z')){
    			return true;
    	}
    	return false;
    }
    
}
