package leetCode;

public class MaxProduct {
	public int maxProduct(int[] nums) {
		int result = 1;
		int max = 1;
		int min = 1;
		
		for(int item : nums){
			if(item > 0){
				max = max*item;
				min = Math.min(min*item, 1);
			} else if(item == 0){
				max = 1;
				min = 1;
			} else {
				int temp = max;
				max = Math.max(min*item, 1);
				min = temp*item;
			}
			
			if(result < max)
				result = max;
		}
		
		if(result == 1){
			result = nums[0];
			for(int item : nums){
				if(item > result)
					result = item;
			}
		}
		return result;
    }
}
