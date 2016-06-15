package year2016;

public class SearchRange {
	public int[] searchRange(int[] nums, int target) {
		if(nums == null || nums.length == 0)
			return null;
		
		return search(nums, target, 0, nums.length-1);
    }
	
	private int[] search(int[] nums, int target, int start, int end){
		int[] result = {-1, -1};

		if(start > end)
			return result;
			
		int mid = (start+end)/2;
		
		if(nums[mid] < target){
			return search(nums, target, mid+1, end);
		} else if(nums[mid] > target){
			return search(nums, target, start, mid-1);
		} else {
			int[] left = search(nums, target, start, mid-1);
			int[] right = search(nums, target, mid+1, end);
			if(left[0] == -1)
				result[0] = mid;
			else 
				result[0] = left[0];
			
			if(right[1] == -1)
				result[1] = mid;
			else 
				result[1] = right[1];
		}
		
		return result;
	}
}
