package leetCode;

public class FindMinInRotatedArray {
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        
        while(start <= end){
        	int mid = (start+end)/2;
        	
        	if(start == end)
        		return nums[start];
        	if(end-start == 1)
        		return Math.min(nums[start], nums[end]);
        	
        	if(nums[start] < nums[end])
        		return nums[start];
        	else if(nums[start] > nums[mid]){
        		end = mid;
        	} else {
        		start = mid;
        	}
        }
        return nums[0];
    }
}
