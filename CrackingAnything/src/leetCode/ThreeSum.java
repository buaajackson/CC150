package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
    	
    	int len = nums.length;
    	List<List<Integer>> result = new ArrayList<List<Integer>>();
        
        Arrays.sort(nums);
        
        for(int i = 0; i < len-2; i++){

        	if(i == 0 || (i>0 && nums[i-1] < nums[i])){
	        	int start = i+1;
	        	int end = len-1;
	        	while(start < end){
	        		if(nums[start] + nums[i] + nums[end] == 0){
	        			List<Integer> list = new ArrayList<Integer>();
	        			list.add(nums[i]);
	        			list.add(nums[start]);
	        			list.add(nums[end]);
	        			result.add(list);
	        			
	        			start++;
	        			end--;
	        			
	        			while(start < end && nums[start] == nums[start-1]){
	        				start++;
	        			}
	        			
	        			while(start < end && nums[end] == nums[end+1]){
	        				end--;
	        			}
	        		} else if (nums[start] + nums[i] + nums[end] < 0){
	        			start++;
	        		} else {
	        			end--;
	        		}
	        		
	        	}
        	}
        }
        return result;
    }
}
