package leetCode;

public class MinimumSubArray {
	
	public int minSubArrayLen(int s, int[] nums) {
		int start = 0;
		int end = 0;
		int sum = 0;
		
		if(nums == null)
			return 0;
		
		int result = nums.length;
		
		while(end < nums.length){
			while(sum < s && end < nums.length){
				sum += nums[end];
				end++;
			}
			
			while(sum >= s && start <= end){
				if(sum >= s){
					result = Math.min(result, end-start);
				}
				sum -= nums[start];
				start++;
			}
		}
		return result;
    }
}
