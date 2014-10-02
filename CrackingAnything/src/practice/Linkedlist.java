package practice;

import java.util.HashSet;

import structure.ListNode;

public class Linkedlist {

	//2.1
	public ListNode removeDuplicates(ListNode head){
		
		ListNode headCopy = head;
		HashSet<Integer> set = new HashSet<Integer>();
		
		if(head == null || head.next)
			return head;

		while(head.next.next != null){
			if(set.contains(head.val)){
				
			}
		}
	}
}
