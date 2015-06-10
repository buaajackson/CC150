package leetCode;

import java.util.ArrayList;
import java.util.List;
import practice.Interval;

public class InsertInterval {
	public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
		List<Interval> result = new ArrayList<Interval>();
		
		if(intervals == null || intervals.size() == 0){
			result.add(newInterval);
			return result;
		}
        	
        if(newInterval == null)
        	return intervals;
        
        
        for(Interval item : intervals){
        	if(item.end < newInterval.start)
        		result.add(item);
        	else if(newInterval.end < item.start){
        		result.add(newInterval);
        		newInterval = item;
        	}
        	if(item.end >= newInterval.start || item.start >= newInterval.end){
        		newInterval = new Interval(Math.min(item.start, newInterval.start), Math.max(item.end, newInterval.end));
        	}
        }
        
        result.add(newInterval);
        return result;
    }
}
