package leetCode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> solution = new ArrayList<Integer>();
        
       findSum(candidates, 0, target, result, solution);

       return result;
    }
    
    private void findSum(int[] candidates, int sum, int target, List<List<Integer>> result, List<Integer> solution){
    	if(sum > target)
    		return;
    	
    	if(sum == target){
    		Collections.sort(solution);
    		List<Integer> temp = new ArrayList<Integer>(solution);
    		for(List<Integer> item : result){
    			if(item.equals(temp))
    				return;
    		}
    		
    		result.add(temp);
    		return;
    	}
    	
    	 for(int i = 0; i < candidates.length; i++){
    		 if(candidates[i] > target)
    			 return;
    		 
    		 solution.add(candidates[i]);
    		 findSum(candidates, sum+candidates[i], target, result, solution);
    		 solution.remove(solution.size()-1);
         }
    }
}
