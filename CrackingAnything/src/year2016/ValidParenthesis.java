package year2016;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParenthesis {
    public boolean isValid(String s) {
        if(s == null || s.length() == 0)
        	return true;
        
        Map<Character, Character> map = new HashMap<Character, Character>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i < s.length(); i++){
        	if(!map.containsKey(s.charAt(i))){
        		if(stack.isEmpty())
        			return false;
        		char temp = stack.pop();
        		if(map.get(temp) != s.charAt(i))
        			return false;
        	} else {
        		stack.add(s.charAt(i));
        	}
        }
        return stack.isEmpty();
    }
}
