package practice;

import java.util.ArrayList;
import java.util.List;

import leetCode.SearchInRotatedArray;
import leetCode.Subset;
import leetCode.TrappingWater;
import leetCode.Triangle;
import leetCode.TwoSum;
import leetCode.UniquePathWithObstacles;
import leetCode.WordSearch;
import TDD.TestArrayStrings;
import structure.ListNode;

public class Main {

	public static void main(String[] args) {
		Solution so = new Solution();
/*		
		int[] arr = {2,3,6,7};
		so.combinationSum(arr, 7);

		
		char[][] matrix = {{'.', '8', '7', '6', '5', '4', '3', '2', '1'}, {'2', '.', '.', '.', '.', '.', '.', '.', '.'}, 
				 {'3', '.', '.', '.', '.', '.', '.', '.', '.'}, {'4', '.', '.', '.', '.', '.', '.', '.', '.'}, {'5', '.', '.', '.', '.', '.', '.', '.', '.'}
				, {'6', '.', '.', '.', '.', '.', '.', '.', '.'}, {'7', '.', '.', '.', '.', '.', '.', '.', '.'}, {'8', '.', '.', '.', '.', '.', '.', '.', '.'}
				, {'9', '.', '.', '.', '.', '.', '.', '.', '.'}};
		so.isValidSudoku(matrix);

		String str = "abcdabcdefg";
		so.getLongestDistinctSubstring(str);

		ListNode l3 = new ListNode(5);
		ListNode l2 = new ListNode(3, l3);
		ListNode l1 = new ListNode(1, l2);
		
		ListNode l5 = new ListNode(4);
		ListNode l4 = new ListNode(2, l5);
		so.mergeLinkedList(l1, l4);

		int[] arr = {10,8,5,4,6,3};
		so.getLongestConsecutive(arr);

		so.getCountAndSay(5);

		ArrayStrings array = new ArrayStrings();
		array.isUnique("asdfqwer");
		
		WordSearch ws = new WordSearch();
		ws.exist(new char[][]{{'a', 'b'}}, "ba");

		UniquePathWithObstacles upo = new UniquePathWithObstacles();
		upo.uniquePathsWithObstacles(new int[][] {{0, 0}});

		Triangle triangle = new Triangle();
		List<List<Integer>> outList = new ArrayList<List<Integer>>(); 
		List<Integer> innerList = new ArrayList<Integer>();
		innerList.add(1);
		
		List<Integer> innerList2 = new ArrayList<Integer>();
		innerList2.add(2);
		innerList2.add(3);
		
		outList.add(innerList);
		outList.add(innerList2);
		
		triangle.minimumTotal(outList);
		
		TwoSum ts = new TwoSum();
		ts.twoSum(new int[] {3, 2, 4}, 6);

		TrappingWater tw = new TrappingWater();
		tw.trap(new int[] {0, 2, 0});
		
		Subset ss = new Subset();
		ss.subsets(new int[] {0});
*/
		SearchInRotatedArray sra = new SearchInRotatedArray();
		sra.search(new int[] {1,3}, 3);
	}

}
