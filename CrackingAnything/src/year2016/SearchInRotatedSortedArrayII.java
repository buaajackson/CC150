package year2016;

public class SearchInRotatedSortedArrayII {
    public boolean search(int[] nums, int target) {
    	if(nums == null || nums.length == 0)
    		return false;
    	
    	int start = 0;
    	int end = nums.length - 1;
    	while(start <= end){
    		int mid = (start+end)/2;
    		if(nums[mid] == target){
    			return true;
    		} else if(nums[mid] < target){
    			if(nums[end] >= target){
    				start = mid+1;
    			} else {
    				end = mid-1;
    			}
    		} else {
    			if(nums[start] <= target){
    				end = mid-1;
    			} else {
    				start = mid+1;
    			}
    		}
    	}
    	return false;
    }
}
