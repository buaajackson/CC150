package year2016;

public class ReverseWords {
    public String reverseWords(String s) {
    	if(s == null || s.length() == 0)
    		return s;
    	
    	String[] arr = s.split(" ");
    	StringBuilder sb = new StringBuilder();
    	for(int i = arr.length-1; i >= 0; i--){
    		if(!arr[i].equals("")){
    			if(i == arr.length-1){
    				sb.append(arr[i]);
    			}
    			sb.append(" " + arr[i]);
    		}
    	}
    	return sb.toString();
    }
}
