package year2016;

public class MajorityElement {

	public int majorityElement(int[] nums) {
		int result = nums[0];
		int count = 0;
		
		for(int num : nums){
			if(count == 0){
				result = num;
				count = 1;
			}
			else if(num == result){
				count++;
			}
			else {
				count--;
			}
		}
		
		return result;
	}
}
