package year2016;

public class RemoveElement {

    public int removeElement(int[] nums, int val) {
    	if(nums == null || nums.length == 0)
    		return 0;
    	
    	int a = 0;
    	int b = 0;
    	while(a < nums.length && b < nums.length){
    		if(nums[a] != val){
    			a++;
    			b = a+1;
    			continue;
    		}
    		
    		if(nums[b] == val){
    			b++;
    			continue;
    		}
    		
    		int temp = nums[a];
    		nums[a] = nums[b];
    		nums[b] = temp;
    	}
    	
    	return a;
    }
}
