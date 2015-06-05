package leetCode;

public class RemoveDup {
	public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0)
        	return 0;
        
        int current = 0;
        int count = 1;
        
        for(int i = 1; i < nums.length; i++){
	        if(nums[current] == nums[i]){
	        	if(count == 2){	
	        		continue;
	        	}
	        	count++;
	        	nums[++current] = nums[i];
        	} else {
        		current++;
        		nums[current] = nums[i];
        		count = 1;
        	}
        }
        return current+1;
    }
}
