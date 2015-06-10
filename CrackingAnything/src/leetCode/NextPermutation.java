package leetCode;

public class NextPermutation {
	public void nextPermutation(int[] nums) {
        if(nums == null || nums.length == 0)
        	return;
        
        int len = nums.length;
        
        int m = -1;
        for(int i = len-1; i > 0; i--){
        	if(nums[i-1] < nums[i]){
        		m = i-1;
        		break;
        	}
        }
        
        if(m == -1){
        	reverse(nums, 0);
        	return;
        }
        
        int n = -1;
        for(int i = len-1; i > m; i--){
        	if(nums[i] > nums[m]){
        		n = i;
        		break;
        	}
        }
        
        int temp = nums[m];
        nums[m] = nums[n];
        nums[n] = temp;
        
        reverse(nums, m+1);
    }
	
	private void reverse(int[] nums, int start){
		int first = start;
		int last = nums.length-1;
		while(first < last){
			int temp = nums[first];
			nums[first] = nums[last];
			nums[last] = temp;
			first++;
			last--;
		}
	}
}
