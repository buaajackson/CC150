package year2016;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
	public List<List<Integer>> threeSum(int[] nums) {
		if (nums == null || nums.length < 3)
			return null;

		Arrays.sort(nums);
		List<List<Integer>> lists = new ArrayList<List<Integer>>();

		for (int i = 0; i < nums.length - 2; i++) {
			if (i == 0 || nums[i - 1] < nums[i]) {
				int second = i + 1;
				int last = nums.length - 1;

				while (second < last) {
					if((second != i+1) && nums[second-1] == nums[second]){
						second++;
						continue;
					}
					
					if(last != nums.length-1 && nums[last] == nums[last+1]){
						last--;
						continue;
					}
					
					int sum = nums[i] + nums[second] + nums[last];
					if (sum == 0) {
						List<Integer> list = new ArrayList<Integer>();
						list.add(nums[i]);
						list.add(nums[second]);
						list.add(nums[last]);
						lists.add(list);
					} else if (sum < 0) {
						second++;
					} else {
						last--;
					}
				}
			}
		}
		return lists;
	}
}
