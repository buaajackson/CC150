package year2016;

public class StringToInteger {
    public int myAtoi(String str) {
        if(str == null || str.length() == 0)
        	return 0;
        
        str = str.trim();
        
        boolean isPositive = true;
        int curr = 0;
        if(str.charAt(curr) == '-'){
        	isPositive = false;
        	curr++;
        } else if(str.charAt(curr) == '+'){
        	curr++;
        }
        
        double result = 0.0;
        for(int i = curr; i < str.length(); i++){
        	char temp = str.charAt(i);
        	if(temp >= '0' && temp <= '9')
        	    result = result*10 +  temp - '0';
        	else 
        	    break;
        }
        
        if(!isPositive){
        	result *= -1;
        }
        
        if(result > Integer.MAX_VALUE)
        	return Integer.MAX_VALUE;
        else if(result < Integer.MIN_VALUE)
        	return Integer.MIN_VALUE;
        else 
        	return (int)result;
    }
}
