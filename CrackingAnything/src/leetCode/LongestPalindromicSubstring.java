package leetCode;

public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        if(s == null || s.length() == 1)
        	return s;
        
        String longest = "";
        for(int i = 0; i < s.length(); i++){
        	String temp = getLongest(s, i, i);
        	if(temp.length() > longest.length()){
        		longest = temp;
        	}
        	
        	temp = getLongest(s, i, i+1);
        	if(temp.length() > longest.length())
        		longest = temp;
        }
        return longest;
    }
    
    private String getLongest(String s, int start, int end){
    	while(start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)){
    		start--;
    		end++;
    	}
    	return s.substring(start+1, end);
    }
}
