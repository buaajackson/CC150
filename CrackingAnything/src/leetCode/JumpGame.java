package leetCode;

public class JumpGame {
	public boolean canJump(int[] nums) {
        if(nums == null)
            return false;
        
        if(nums.length == 1)
            return true;
		
		int dest = nums.length-1;
		int max = 0;
        
        for(int i = 0; i < nums.length-1 && i <= max; i++){
        	max = Math.max(max, nums[i] + i);
        	if(max >= dest)
        		return true;
        }
        return false;
    }
}
