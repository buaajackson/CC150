package practice;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import structure.ListNode;

public class Solution {
	
	public ArrayList<ArrayList<Integer>> combinationSum(int[] arr, int target){
		ArrayList<ArrayList<Integer>> lists = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		if(arr == null || arr.length == 0)
			return lists;
		
		getCombinationSum(arr, target, target, 0, lists, list);
		return lists;
	}
	
	private void getCombinationSum(int[] arr, int target, int diff, int index, ArrayList<ArrayList<Integer>> lists, ArrayList<Integer> list){
		if(diff == 0){
			ArrayList<Integer> temp = new ArrayList<Integer>(list); 
			lists.add(temp);
		}
		
		for(int i = index; i < arr.length; i++){
			if(diff < arr[i])
				return;
			list.add(arr[i]);
			getCombinationSum(arr, target, diff - arr[i], i, lists, list);
			list.remove(list.size() - 1);
		}
	}
	
	public boolean isValidSudoku(char[][] board) {
        if(board == null || board.length == 0 || board[0].length == 0)
            return false;
        
        int len = board.length;
        int[][] col = new int[len][len];
        int[][] row = new int[len][len];
        int[][] block = new int[len][len];
        
        for(int i = 0; i < len; i++){
            for(int j = 0; j < len; j++){
                int cur = board[i][j] - '0';
                if(cur <= 9 && cur >= 0){
                	System.out.println("row " + i + " col " + j);
                	if(row[i][cur-1] != 0 || col[j][cur-1] != 0 || block[(i/3)*3 + j/3][cur-1] != 0)
                        return false;
                    else {
                        row[i][cur-1] = 1;
                        col[j][cur-1] = 1;
                        block[(i/3)*3 + j/3][cur-1] = 1;
                    }
                }
            }
        }
        return true;
    }
	
	public int getLongestDistinctSubstring(String str){
		if(str == null || str.length() == 0)
			return 0;
		
		boolean[] exists = new boolean[256];
		int start = 0;
		int end = 0;
		int max = 0;
		
		while(end < str.length()){
			if(exists[str.charAt(end)]){
				while(str.charAt(start) != str.charAt(end)){
					exists[str.charAt(start)] = false;
					start++;
				}
				start++;
				end++;
				max = Math.max(end-start, max);
				
			} else {
				exists[str.charAt(end)] = true;
				end++;
			}
		}
		max = Math.max(end-start, max);
		return max;
	}
	
	public ListNode mergeLinkedList(ListNode l1, ListNode l2){
		ListNode head = new ListNode(-1);
		ListNode fakeHead = head;
		while(l1 != null && l2 != null){
			if(l1.val < l2.val){
				head.next = l1;
				head = head.next;
				l1 = l1.next;
			} else if (l1.val > l2.val){
				head.next = l2;
				head = head.next;
				l2 = l2.next;
			}
		}
		
		if(fakeHead.next == null)
			return fakeHead.next;
		
		if(l1 == null){
			head.next = l2;
		}
		
		if(l2 == null)
			head.next = l1;
		
		return fakeHead.next;	
	}
	
	public int removeDuplicates(int[] arr){
		if(arr == null || arr.length == 0)
			return 0;
		
		int index = 0;
		for(int i = 1; i < arr.length; i++){
			if(arr[index] != arr[i]){
				arr[++index] = arr[i];
			}
		}
		return index+1;
	}
	
	public int getLongestConsecutive(int[] arr){
		Set<Integer> set = new HashSet<Integer>();
		for(int i : arr){
			set.add(i);
		}
		
		int max = 0;
		
		for(int i : arr){
			if(set.contains(i)){
				int count = 1;
				set.remove(i);
				int left = i - 1;
				int right = i + 1;
				
				while(set.contains(left)){
					set.remove(left);
					count++;
					left--;
				}
				
				while(set.contains(right)){
					set.remove(right);
					count++;
					right++;
				}
				
				max = Math.max(max, count);
			}
		}
		return max;
	}
	
	public String getCountAndSay(int n){
		String[] result = new String[n];
		result[0] = "1";
		for(int i = 1; i < n; i++){
			result[i] = getCount(result[i-1]);
		}
		
		return result[n-1];
	}
	
	private String getCount(String str){
		char cur = str.charAt(0);
		StringBuilder sb = new StringBuilder();
		int count = 1;
		for(int i = 1; i < str.length(); i++){
			if(str.charAt(i) == cur)
				count++;
			else{
				sb.append(count);
				sb.append(cur);
				cur = str.charAt(i);
				count = 1;
			}
		}
		sb.append(count);
		sb.append(cur);
		return sb.toString();
	}
	
	
	
	
	
	
	
	
	
	
	
}
