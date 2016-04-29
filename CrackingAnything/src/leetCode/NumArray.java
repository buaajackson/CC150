package leetCode;

public class NumArray {

    int [] sum = null;
    int [] num = null;
    
    public NumArray(int[] nums) {
        if(nums == null || nums.length == 0)
            return;
        
        num = nums;
        sum = new int [nums.length];
        
        sum[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            sum[i] = sum[i-1] + nums[i];
        }
    }

    public int sumRange(int i, int j) {
        return sum[j] - sum[i] + num[i];
    }
}
