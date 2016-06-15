package year2016;

public class FindPeak {

    public int findPeakElement(int[] nums) {
    	if(nums == null || nums.length <= 2)
    		return -1;
    	
    	for(int i = 2; i < nums.length; i++){
    		if(nums[i-2] < nums[i-1] && nums[i-1] > nums[i]){
    			return i-1;
    		}
    	}
    	return -1;
    }
}
