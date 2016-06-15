package year2016;

public class LongestIncreasingSequense {
	public int lengthOfLIS(int[] nums) {
		if(nums == null || nums.length == 0)
			return 0;
		
		int max = 1;
		int[] count = new int[nums.length];
		count[0] = 1;
		for(int i = 1; i < nums.length; i++){
			count[i] = 1;
			for(int j = i-1; j >= 0; j--){
				if(nums[j] < nums[i]){
					count[i] = Math.max(count[j]+1, count[i]);
					max = Math.max(count[i], max);
				}
			}
		}
		return max;
    }
}
