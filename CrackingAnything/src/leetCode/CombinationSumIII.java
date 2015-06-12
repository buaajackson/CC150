package leetCode;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumIII {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> results = new ArrayList<List<Integer>>();
        List<Integer> solution = new ArrayList<Integer>();
        
        getSum(k, n, 1, results, solution);
        return results;
    }
    
    private void getSum(int k, int n, int start, List<List<Integer>> results, List<Integer> solution){
    	
    	if(n < 0 || solution.size() > k)
    		return;
    	else if(n == 0 && solution.size() == k){
    		List<Integer> temp = new ArrayList<Integer>(solution);
    		results.add(temp);
    		return;
    	}
    	
    	for(int i = start; i <= 9; i++){
    		solution.add(i);
    		getSum(k, n-i, i+1, results, solution);
    		solution.remove(solution.size()-1);
    	}
    }
}
