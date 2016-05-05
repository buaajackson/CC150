package year2016;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleII {
	public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        
        for(int i = 0; i < rowIndex; i++){
        	List<Integer> temp = new ArrayList<Integer>();
        	temp.add(1);
        	
        	for(int j = 1; j < list.size(); j++){        		
        		temp.add(list.get(j-1) + list.get(j));
        	}
        	temp.add(1);
        	list = temp;
        }
        
        return list;
    }
}
