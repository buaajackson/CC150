package leetCode;

import java.util.Arrays;

public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        int len = nums.length;
    	if(nums == null || len < 3)
    		return 0;
    	
    	Arrays.sort(nums);
    	int result = nums[0] + nums[1] + nums[len-1];
    	
    	for(int i = 0; i < nums.length - 2; i++){
    		if(i == 0 || nums[i-1] < nums[i]){
    			int start = i+1;
    			int end = len-1;
    			while(start < end){
    				int temp = nums[i] + nums[start] + nums[end] - target;
    				
    				if(temp == 0)
    					return target;
    				else if(temp > 0)    					
    					end--;
    				else
    					start++;
    				
    				if(Math.abs(temp) < Math.abs(result - target))
    					result = temp + target;
    				
    			}
    		}
    	}
    	return result;
    }
}
