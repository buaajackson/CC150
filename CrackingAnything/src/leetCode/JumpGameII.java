package leetCode;

public class JumpGameII {
    public int jump(int[] nums) {
        if(nums == null || nums.length <= 1)
        	return 0;
        
        int max = 0;
        int len = nums.length;
        int count = 0;
        int last = 0;
        
        for(int i = 0; i < len && i <= max; i++){
        	if(i > last){
        		last = max;
        		count++;
        	}
        	
        	max = Math.max(max, i+nums[i]);
        }
        
        return -1;
    }
}
