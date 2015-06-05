package leetCode;

public class SortColor {
	public void sortColors(int[] nums) {
        if(nums == null || nums.length == 0 || nums.length == 1)
        	return;
        
        int red = 0;
        int blue = nums.length - 1;
        int index = 0;
        
        while(index <= blue){
        	if(nums[index] == 0){
        		nums[index] = nums[red];
        		nums[red] = 0;
        		red++;
        		index++;
        	} else if(nums[index] == 2){
        		nums[index] = nums[blue];
        		nums[blue] = 2;
        		blue--;
        	} else {
        		index++;
        	}
        }
    }
}
