package year2016;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import structure.Interval;

public class MergeIntervals {
	public List<Interval> merge(List<Interval> intervals) {
		if(intervals == null || intervals.size() <= 1)
			return intervals;
		
		Collections.sort(intervals, new IntervalComparator());
		List<Interval> result = new ArrayList<Interval>();
		Interval pre = intervals.get(0);
		for(int i = 1; i < intervals.size(); i++){
			if(pre.end >= intervals.get(i).start){
				pre = new Interval(pre.start, Math.max(pre.end, intervals.get(i).end));
			} else {
				result.add(pre);
				pre = intervals.get(i);
			}
		}
		
		result.add(pre);
		return result;
	}
}

class IntervalComparator implements Comparator<Interval> {
	public int compare(Interval i1, Interval i2) {
		return i1.start - i2.start;
	}
}
