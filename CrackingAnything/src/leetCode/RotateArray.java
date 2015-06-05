package leetCode;

public class RotateArray {
	public void rotate(int[] nums, int k) {
        if(nums == null || nums.length == 0 || k == 0)
        	return;
        
        int len = nums.length;
        k = k%len;
        
        rotate(nums, 0, len-1-k);
        rotate(nums, len-k, len-1);
        rotate(nums, 0, len-1);
    }
	
	private void rotate(int[] nums, int left, int right) {
		while(left < right){
			int temp = nums[left];
			nums[left] = nums[right];
			nums[right] = temp;
			left++;
			right--;
		}
	}
}
