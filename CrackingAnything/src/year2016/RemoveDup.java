package year2016;

public class RemoveDup {

	public int removeDuplicates(int[] nums) {
		if(nums == null || nums.length == 0){
			return 0;
		}
		
		int pre = nums[0];
		int current = 0;
		for(int i = 1; i < nums.length; i++){
			if(nums[i] != pre && current+1 < nums.length){
				nums[current+1] = nums[i];
				current++;
				pre = nums[i];
			}
		}
		return current+1;
			
    }
}
