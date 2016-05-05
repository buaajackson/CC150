package year2016;

import java.util.ArrayList;
import java.util.List;

public class MajorityElementII {
	public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
		int count1 = 0;
        int count2 = 0;
        int result1 = 0;
        int result2 = 0;
        
        for(int num : nums){
        	if(count1 == 0){
        		result1 = num;
        		count1 = 1;
        	} else if(num == result1){
        		count1++;
        	} else if(count2 == 0){
        		result2 = num;
        		count2 = 1;
        	} else if (num == result2) {
        		count2++;
        	} else {
        		count1--;
        		count2--;
        	}
        }
        
        count1 = 0;
        count2 = 0;
        
        for(int num : nums){
        	if(result1 == num)
        		count1++;
        	else if(num == result2)
        		count2++;
        }
        
        if(count1 > nums.length/3){
        	list.add(result1);
        }
        
        if(count2 > nums.length/3) {
        	list.add(result2);
        }
        
        return list;
    }
}
