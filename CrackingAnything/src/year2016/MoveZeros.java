package year2016;

public class MoveZeros {

    public void moveZeroes(int[] nums) {
    	if(nums == null || nums.length == 0)
    		return;
    	
    	int zero = 0;
    	int nonZero = 0;
    	
    	while(nonZero < nums.length && zero < nums.length) {
    		if(nums[zero] != 0) {
    			zero++;
    			nonZero = zero+1;
    			continue;
    		}
    		
    		if(nums[nonZero] == 0){
    			nonZero++;
    			continue;
    		}
    		
    		nums[zero] = nums[nonZero];
    		nums[nonZero] = 0;
    		zero++;
    		nonZero++;
    	}
    	
    }
}
