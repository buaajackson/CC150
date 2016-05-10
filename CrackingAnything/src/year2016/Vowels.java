package year2016;

import java.util.Stack;

public class Vowels {
    public String reverseVowels(String s) {
        String vowels = "aeiouAEIOU";
        Stack<Character> stack = new Stack<Character>();
        
        char[] arr = s.toCharArray();
        for(int i = 0; i < arr.length; i++){
            if(vowels.indexOf(arr[i]) >= 0){
            	stack.add(arr[i]);
            }
        }
        
        for(int i = 0; i < arr.length; i++){
        	if(vowels.indexOf(arr[i]) >= 0){
        		arr[i] = stack.pop();
        	}
        }
        return new String(arr);
    }
}
