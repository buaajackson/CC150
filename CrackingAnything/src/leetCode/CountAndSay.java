package leetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class CountAndSay {

    public String countAndSay(int n) {
        if(n == 1)
            return "1";
        
        String result = "1";
        
        for(int i = 0; i < n-1; i++){
        	result = count(result);
        }
        return result;
    }
    
    private String count(String input){
    	char last = input.charAt(0);
    	int count = 1;
    	StringBuilder sb = new StringBuilder();
    	
    	for(int i = 1; i < input.length(); i++){
    		if(input.charAt(i) == last){
    			count++;
    		} else {
    			sb.append(count);
    			sb.append(last);
    			last = input.charAt(i);
    			count = 1;
    		}
    	}
    	sb.append(count);
    	sb.append(last);
    	return sb.toString();

    }
	
    
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length())
            return false;
        
        Map<Character, Character> map = new HashMap<Character, Character>();
        for(int i = 0; i < s.length(); i++){
        	char a = s.charAt(i);
        	char b = t.charAt(i);
        	
        	char c = 0;
        	if(map.containsKey(a))
        		c = map.get(a);
        	
        	char d = 0;
        	if(map.containsKey(b))
        		d = map.get(b);
        	
            if(c != 0 && c != t.charAt(i)){
                return false;
            } else if(d != 0 && d != s.charAt(i)){
            	return false;
            } else {
            	map.put(a, b);
            	map.put(b, a);
            }
        }
        
        return true;
    }
    
    
    public String countAndSayAnother(int n) {
        int count = 1;
        int last = n % 10;
        n = n/10;
        String result = "";
        
        while(n != 0){
            int num = n%10;
            n = n/10;
            if(num == last){
                count++;
            } else {
                result = count + "" + last + result;
                last = num;
                count = 1;
            }
        }
        return count + last + result;
    }
    
    public List<String> summaryRanges(int[] nums) {
        if(nums == null || nums.length == 0)
            return null;
        
        List<String> result = new ArrayList<String>();
        int head = 0;
        int tail = 1;
        while(tail < nums.length){
            while(tail < nums.length && nums[tail] - nums[tail-1] == 1){
                tail++;
            }
            
            if(tail == nums.length){
                result.add(nums[head] + "->" + nums[tail-1]);
                return result;
            }
            
            addSummary(head, tail, nums, result);
        }
        
        addSummary(head, tail, nums, result);
        return result;
    }
    
    private void addSummary(int head, int tail, int[] nums, List<String> result){
        if(tail-head == 1){
            result.add(String.valueOf(nums[head]));
            head = tail;
            tail++;
        } else {
            result.add(nums[head] + "->" + nums[tail-1]);
            head = tail;
            tail++;
        }
    }
    
    public boolean isHappy(int n) {
    	Set<Integer> set = new HashSet<Integer>();
    	
    	while(n != 1){
            if(set.contains(n))
                return false;
            else
                set.add(n);
                
            n = convert(n);
        }
        return true;
    }
    
    private int convert(int n){
        int sum = 0;
        while(n > 0){
            int next = n%10;
            n /= 10;
            sum += next*next;
        }
        return sum;
    }
    
    public int hammingWeight(int n) {
        int count = 0;
        for(int i = 0; i < 32; i++){
            if((n & (1 << i)) == 1)
                count++;
        }
        return count;
    }
    
    public String convertToTitle(int n) {
        String result = "";
        while(n > 0){
            int next = n % 26;
            result = next + 'A' + result;
            n /= 26;
        }
        
        return result;
    }
    
	public int minSubArrayLen(int s, int[] nums) {

		if(nums == null || nums.length == 0)
			return 0;
		
		int start = 0;
		int end = 0;
		int sum = nums[0];
				
		int result = Integer.MAX_VALUE;
		
		while(end < nums.length){
			while(sum < s && end < nums.length){
				end++;
				if(end < nums.length)
					sum += nums[end];
			}
			
			if(sum >= s){
				result = Math.min(result, end-start+1);
				sum -= nums[start];
				start++;
			}
		}
		int finals =  result > nums.length? 0 : result;
		return finals;
		
    }
}
