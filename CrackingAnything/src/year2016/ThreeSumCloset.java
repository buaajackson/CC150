package year2016;

import java.util.Arrays;

public class ThreeSumCloset {
    public int threeSumClosest(int[] nums, int target) {
    	if(nums == null || nums.length < 3)
    		return 0;
    	
    	Arrays.sort(nums);
    	int diff = Integer.MAX_VALUE;
    	int result = 0;
    	
    	for(int i = 0; i < nums.length - 2; i++){
    		int second = i+1;
    		int last = nums.length - 1;
    		
    		while(second < last){
    			int sum = nums[i] + nums[second] + nums[last];
    			
    			if(sum == target)
    				return sum;
    			else if(sum < target){
    				second++;
    			}
    			else {
    				last--;
    			}
    			
    			if(Math.abs(sum - target) < diff){
    				diff = Math.abs(sum - target);
    				result = sum;
    			}
    		}
    	}
    	return result;
    }
}
