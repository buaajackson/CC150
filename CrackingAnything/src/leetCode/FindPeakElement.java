package leetCode;

public class FindPeakElement {
    public int findPeakElement(int[] nums) {
    	return find(nums, 0, nums.length-1);
    }
    
    private int find(int[] nums, int start, int end){
    	int mid = (start+end)/2;
    	
        if((mid == 0 || nums[mid] >= nums[mid - 1]) && (mid == nums.length - 1 || nums[mid] >= nums[mid + 1])) {
            return mid;
        }
    	else if(mid > 0 && nums[mid-1] > nums[mid]){
    		return find(nums, start, mid-1);
    	} else {
    		return find(nums, mid+1, end);
    	}
    	
    }
}
