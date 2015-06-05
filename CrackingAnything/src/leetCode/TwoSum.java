package leetCode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	
    public int[] twoSum(int[] nums, int target) {
        if(nums.length == 0)
			return null;
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for(int i : nums){
        	if(map.get(i) == null)
        		map.put(i, 1);
        	else
        		map.put(i, map.get(i)+1);
        }
        
        int[] result = new int[2];
        for(int i = 0;  i < nums.length; i++){
        	map.put(nums[i], map.get(nums[i])-1);
        	if(map.get(target-nums[i]) != null && map.get(target-nums[i]) != 0){
        		result[0] = i+1;
        		result[1] = target-nums[i];
        		break;
        	}
        	map.put(nums[i], map.get(nums[i])+1);
        }
        
        for(int i = nums.length - 1; i >= 0; i--){
        	if(nums[i] ==  result[1]){
        		result[1] = i+1;
        		break;
        	}
        }
        	
        return result;
    }
}
