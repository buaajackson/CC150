package year2016;

import java.util.ArrayList;
import java.util.List;

import structure.Interval;

public class Y2016Main {

	public static void main(String[] args) {
//		MergeSortedArray m = new MergeSortedArray();
//		m.merge(new int[] {0}, 0, new int[] {1}, 1);
		
//		ThreeSum ts = new ThreeSum();
//		ts.threeSum(new int[] {0, 0, 0});
//		
//		MajorityElementII me = new MajorityElementII();
//		me.majorityElement(new int[] {8,8,7,7,7});

//		SearchInRotatedSortedArrayII s = new SearchInRotatedSortedArrayII();
//		s.search(new int[] {1, 3}, 3);
		
//		SearchInsert si = new SearchInsert();
//		si.searchInsert(new int[] {1}, 2);
		
		MergeIntervals mi = new MergeIntervals();
		Interval l1 = new Interval(1, 4);
		Interval l2 = new Interval(0, 2);
		Interval l3 = new Interval(3, 5);
		List<Interval> list = new ArrayList<Interval>();
		list.add(l1);
		list.add(l2);
		list.add(l3);
		mi.merge(list);
	}

}
