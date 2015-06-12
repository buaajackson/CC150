package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CombinationSumII {
	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        if(candidates == null || candidates.length == 0)
        	return null;
		
		List<List<Integer>> results = new ArrayList<List<Integer>>();
        List<Integer> solution = new ArrayList<Integer>();
        
        Arrays.sort(candidates);
        
        getSum(candidates, 0, 0, target, solution, results);
        Set<List<Integer>> set = new HashSet<List<Integer>>(results);
        results.clear();
        results.addAll(set);
        return results;
    }
	
	private void getSum(int[] array, int start, int sum, int target, List<Integer> solution, List<List<Integer>> results){
		if(sum > target)
			return;
		else if(sum == target){
			List<Integer> temp = new ArrayList<Integer>(solution);
			results.add(temp);
			return;
		}
		
		for(int i = start; i < array.length; i++){
			if(array[i] > target)
				return;
			
			solution.add(array[i]);
			getSum(array, i+1, sum + array[i], target, solution, results);
			solution.remove(solution.size()-1);
		}
	}
}
