package year2016;

public class RemoveDupII {
    public int removeDuplicates(int[] nums) {
    	if(nums.length <= 2){
    		return nums.length;
    	}
    	
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
    			nums[++current] = nums[i];
    			count = 1;
    		}
    	}
    	
    	return current+1;
    }
}
