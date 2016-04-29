package practice;

import java.util.ArrayList;
import java.util.List;

import leetCode.BuySellStocksIII;
import leetCode.CombinationSumII;
import leetCode.CountAndSay;
import leetCode.FirstMissingPositive;
import leetCode.JumpGame;
import leetCode.JumpGameII;
import leetCode.LongestPalindromicSubstring;
import leetCode.MaxProduct;
import leetCode.MiniPathSum;
import leetCode.MinimumSubArray;
import leetCode.NextPermutation;
import leetCode.RemoveDupFromLinkedListII;
import leetCode.RemoveLinkedListElements;
import leetCode.SearchInRotatedArray;
import leetCode.Subset;
import leetCode.ThreeSum;
import leetCode.ThreeSumClosest;
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

		SearchInRotatedArray sra = new SearchInRotatedArray();
		sra.search(new int[] {1,3}, 3);

		NextPermutation np = new NextPermutation();
		np.nextPermutation(new int[] {1,3,2});

		MinimumSubArray msa = new MinimumSubArray();
		msa.minSubArrayLen(4, new int[] {1,4,4});

		MiniPathSum mps = new MiniPathSum();
		mps.minPathSum(new int[][] {{1,3,1}, {1,5,1}, {4,2,1}});

		MaxProduct mp = new MaxProduct();
		mp.maxProduct(new int[] {-4, -3});

		JumpGame jg = new JumpGame();
		jg.canJump(new int[] {0, 1});

		FirstMissingPositive fmp = new FirstMissingPositive();
		fmp.firstMissingPositive(new int[] {1,1});

		CombinationSumII cs = new CombinationSumII();
		cs.combinationSum2(new int[] {1,2}, 4);

		BuySellStocksIII bss = new BuySellStocksIII();
		bss.maxProfit(new int[] {2,1,2,0,1});

		ThreeSum ts = new ThreeSum();
		ts.threeSum(new int[] {-2,0,1,1,2});

		ThreeSumClosest tsc = new ThreeSumClosest();
		tsc.threeSumClosest(new int[] {-3,-2,-5,3,-4}, -1);

		RemoveLinkedListElements rlle = new RemoveLinkedListElements();
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(1, a);
		rlle.removeElements(b, 2);

		ListNode a = new ListNode(1);
		ListNode b = new ListNode(1, a);
		RemoveDupFromLinkedListII rdf = new RemoveDupFromLinkedListII();
		rdf.deleteDuplicates(b);

		LongestPalindromicSubstring lps = new LongestPalindromicSubstring();
		lps.longestPalindrome("bb");

		JumpGameII jg = new JumpGameII();
		jg.jump(new int[] {3,2,1,0,2});
*/
		CountAndSay cas = new CountAndSay();
		cas.minSubArrayLen(3, new int[] {1,1});
	}

}
