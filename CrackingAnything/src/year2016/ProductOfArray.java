package year2016;

public class ProductOfArray {

    public int[] productExceptSelf(int[] nums) {
    	if(nums == null || nums.length == 0){
    		return null;
    	}
    	
    	int[] result = new int[nums.length];
    	int p = 1;
    	result[0] = 1;
    	for(int i= 1; i < nums.length; i++){
    		result[i] = result[i-1] * nums[i-1];
    	}
    	
    	for(int i = nums.length-1; i >= 0; i++){
    		result[i] = result[i]*p;
    		p = p*nums[i];
    	}
    	return result;
    }
}