package year2016;

import java.util.Stack;

public class LongestValidBrackets {
    public int longestValidParentheses(String s) {
    	if(s == null || s.length() == 0)
    		return 0;
    	
    	char[] brackets = s.toCharArray();
    	Stack<Integer> stack = new Stack<Integer>();
    	int result = 0;
    	int start = 0;
    	for(int i = 0; i < brackets.length; i++){
    		if(brackets[i] == '('){
    			stack.add(i);
    		} else {
    			if(stack.isEmpty()){
    				start = i + 1;
    			} else {
    				stack.pop();
    				if(stack.isEmpty()){
    					result = Math.max(result, i - start + 1);
    				} else {
    					result = Math.max(result, i - stack.peek());
    				}
    			}
    		}
    	}
    	return result;
    }
}
