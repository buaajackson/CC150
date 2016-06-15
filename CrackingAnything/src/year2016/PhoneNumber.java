package year2016;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneNumber {
    private Map<Character, String> map;
    private char[] container;
    
	public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<String>();
        if(digits == null || digits.length() == 0)
        	return list;
        
        map = new HashMap<Character, String>();
        map.put('1', "");
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        
        container = new char[digits.length()];
        
        getCombinations(list, digits, 0);
        return list;
    }
	
	private void getCombinations(List<String> result, String input, int index){
		if(index == input.length()){
			result.add(new String(container));
			return;
		}
		
		String str = map.get(input.charAt(index));
		for(int i = 0; i < str.length(); i++){
			container[index] = str.charAt(i);
			getCombinations(result, input, index+1);
		}
	}
}
