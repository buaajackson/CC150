package year2016;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    public List<List<Integer>> generate(int numRows) {
    	if(numRows < 0)
    		return null;
    	
    	List<List<Integer>> lists = new ArrayList<List<Integer>>();
    	
    	if(numRows == 0){
    		lists.add(new ArrayList<Integer>());
    		return lists;
    	}
    	 
    	List<Integer> list = new ArrayList<Integer>();
    	list.add(1);
    	lists.add(list);
    	
        for(int i = 0; i < numRows-1; i++){
        	List<Integer> next = new ArrayList<Integer>();
        	next.add(1);
        	for(int j = 1; j < lists.get(i).size(); j++){
        		next.add(lists.get(i).get(j-1) + lists.get(i).get(j));
        	}
        	next.add(1);
        	lists.add(next);
        }
        return lists;
    }
}
