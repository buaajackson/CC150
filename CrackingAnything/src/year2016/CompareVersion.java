package year2016;

public class CompareVersion {
    public int compareVersion(String version1, String version2) {
    	String[] v1 = version1.split("\\.");
    	String[] v2 = version2.split("\\.");
    	
    	for(int i = 0; i < v1.length && i < v2.length; i++){
    		if(Integer.parseInt(v1[i]) > Integer.parseInt(v2[i]))
    			return 1;
    		else if(Integer.parseInt(v1[i]) < Integer.parseInt(v2[i]))
    			return -1;
    	}
    	
    	if(v1.length > v2.length){
    		if(isAllZero(v1, v2.length))
    			return 0;
    		else 
    			return 1;
    	}
    	else if(v1.length < v2.length){
    		if(isAllZero(v2, v1.length))
    			return 0;
    		else 
    			return -1;
    	} else 
    		return 0;
    }
    
    private boolean isAllZero(String[] arr, int start){
    	for(int i = start; i < arr.length; i++){
    		if(Integer.parseInt(arr[i]) != 0)
    			return false;
    	}
    	return true;
    }
}
