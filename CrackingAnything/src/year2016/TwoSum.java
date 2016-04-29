package year2016;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        if(nums == null || nums.length == 0)
			return null;
		
        Map<Integer, List<Integer>> map = this.constructHashmap(nums);
        
        for(int i = 0;  i < nums.length; i++){
        	map.get(nums[i]).remove(0);
        	int remaining = target - nums[i];
        	
        	if(map.containsKey(remaining) && map.get(remaining).size() != 0){
        		return new int[] {i, map.get(remaining).get(0)};
        	}
        	
        }
        return null;
    }
    
    private Map<Integer, List<Integer>> constructHashmap(int[] nums) {
    	Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
    	for(int i = 0; i < nums.length; i++){
    		if(map.containsKey(nums[i])) {
    			List<Integer> list = map.get(nums[i]);
    			list.add(i);
    			map.put(nums[i], list);
    		}
    		else {
    			List<Integer> list = new ArrayList<Integer>();
    			list.add(i);
    			map.put(nums[i], list);
    		}
    	}
    	return map;
    }
}
