package leetCode;

public class Wildcard {
    public boolean isMatch(String s, String p) {
    	int sIndex = 0;
    	int pIndex = 0;
    	boolean isStar = false;
    	
    	while(sIndex < s.length()){
    		if(pIndex == p.length())
    			return false;
    			
    		switch(p.charAt(pIndex)){
	    		case '?':
	    			sIndex++;
	    			pIndex++;
	    			break;
	    		case '*':
	    			isStar = true;
	    			while(p.charAt(pIndex) == '*'){
	    				pIndex++;
	    				
	    				if(pIndex == p.length())
	    					return true;
	    			}
	    			
	    			sIndex++;
	    			break;
	    		default:
	    			if(s.charAt(sIndex) != p.charAt(pIndex)){
	    				if(!isStar)
	    					return false;
	    				sIndex++;
	    				
	    			} else {
	    				sIndex++;
	    				pIndex++;
	    			}
    			
    		}
    	}
    	return pIndex == p.length();
    }
}
