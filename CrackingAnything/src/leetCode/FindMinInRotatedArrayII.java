package leetCode;

import java.util.HashSet;
import java.util.Set;

public class FindMinInRotatedArrayII {
    public int findMin(int[] nums) {
    	int start = 0;
    	int end = nums.length-1;
    	
    	while(start <= end){
    		int mid = (start+end)/2;
    		
    		if(start == end)
    			return nums[start];
    		else if(end - start == 1)
    			return Math.min(nums[start], nums[end]);
    		
    		if(nums[start] < nums[end]){
    			return nums[start];
    		} else if(nums[start] == nums[end]){
    			start = start+1;
    		} else if(nums[start] > nums[mid]){
    			end = mid;
    		} else {
    			start = mid;
    		}
    	}
    	return nums[0];
    }
    
    public boolean containsDuplicate(int[] nums) {
    	Set<Integer> set = new HashSet<Integer>();
        
        for(int item : nums){
        	if(set.contains(item))
        		return true;
        	set.add(item);
        }
        return false;
    }
}
