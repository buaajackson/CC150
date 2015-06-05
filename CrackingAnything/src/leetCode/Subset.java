package leetCode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Subset {
	public List<List<Integer>> subsets(int[] nums) {
		
		List<List<Integer>> lists = new ArrayList<List<Integer>>();
		List<Integer> list = new ArrayList<Integer>();
		lists.add(list);
		
		if(nums.length == 0)
			return lists;
        
		return getSubsets(lists, nums, 0);
    }
	
	private List<List<Integer>> getSubsets(List<List<Integer>> lists, int[] nums, int index){
		if(index == nums.length)
			return lists;
		
		Set<List<Integer>> set = new HashSet<List<Integer>>();
		set.addAll(lists);
		for(List<Integer> item : lists){
			List<Integer> itemCopy = new ArrayList<Integer>();
			itemCopy.addAll(item);
			itemCopy.add(nums[index]);
			Collections.sort(itemCopy);
			set.add(itemCopy);
		}
		
		
		return getSubsets(convertSetToList(set), nums, index+1);
	}
	
	private List<List<Integer>> convertSetToList(Set<List<Integer>> set){
		List<List<Integer>> lists = new ArrayList<List<Integer>>();
		for(List<Integer> item : set){
			lists.add(item);
		}
		return lists;
	}
}
