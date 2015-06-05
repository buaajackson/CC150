package leetCode;

public class SearchInRotatedArray {
	public int search(int[] nums, int target) {
		if(nums == null || nums.length == 0)
			return -1;
		
		int head = 0; 
		int tail = nums.length - 1;
		
		while(head <= tail){
			int mid = (head+tail)/2;
			
			if(nums[mid] == target)
				return mid;
			
			if(nums[head] < nums[mid]){
				if(nums[head] <= target && target < nums[mid]){
					tail = mid-1;
				} else {
					head = mid+1;
				}
			} else if(nums[head] > nums[mid]){
				if(target >= nums[head] || target < nums[mid]){
					tail = mid-1;
				} else {
					head = mid+1;
				}
			} else {
				head = mid+1;
			}
		}
		return -1;
    }
	
	public boolean searchDup(int[] nums, int target) {
		if(nums == null || nums.length == 0)
			return false;
		
		int head = 0;
		int tail = nums.length -1;
		
		while(head <= tail){
			int mid = (head+tail)/2;
			
			if(nums[mid] ==  target)
				return true;
			
			if(nums[head] < nums[mid]){
				if(nums[head] <= target && target < nums[mid]){
					tail = mid-1;
				} else {
					head = mid+1;
				}
			} else if(nums[head] > nums[mid]){
				if(target >= nums[head] || target < nums[mid]){
					tail = mid-1;
				} else {
					head = mid+1;
				}
			} else {
				head++;
			}
		}
		return false;
    } 
}
