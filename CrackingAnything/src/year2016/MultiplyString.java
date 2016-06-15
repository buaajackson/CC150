package year2016;

public class MultiplyString {
    public String multiply(String num1, String num2) {
        if(num1 == null || num1.length() == 0 || num2 == null || num2.length() == 0)
        	return null;
        
        int len = num1.length() + num2.length();
        int[] result = new int[len];
        for(int i = num1.length()-1; i >= 0; i--){
        	for(int j = num2.length()-1; j >= 0; j--){
        		result[len-2-i-j] += (num1.charAt(i)-'0') * (num2.charAt(j)-'0');
        	}
        }
        
        for(int i = 0; i < result.length-1; i++){
        	result[i+1] += result[i]/10;
        	result[i] = result[i]%10;
        }
        
        StringBuilder sb = new StringBuilder();
        boolean begin = true;
        for(int i = result.length-1; i >= 0; i--){
        	if(result[i] == 0 && begin){
        	    continue;
        	}
        	
        	begin = false;
        	sb.append(result[i]);
        }
        
        if(sb.length() == 0){
        	sb.append(0);
        }
        return sb.toString();
    }
}
