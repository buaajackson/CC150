package practice;

import java.util.*;

import javax.swing.text.html.HTMLDocument.RunElement;

import structure.ListNode;

public class CCLinkedList {

	//2.1
	public ListNode removeDuplicates(ListNode head){
		
		ListNode headCopy = head;
		HashSet<Integer> set = new HashSet<Integer>();
		
		if(head == null || head.next == null)
			return head;

		set.add(head.val);
		
		while(head.next != null){
			if(set.contains(head.next.val)){
				head.next = head.next.next;
			} else {
				set.add(head.next.val);
				head = head.next;
			}
		}
		return headCopy;
	}
	
	//2.1 without memory
	public ListNode removeDuplicatesWithoutMem(ListNode head){
		
		ListNode headCopy = head;
		if(head == null || head.next == null)
			return head;
			
		ListNode runner;
		while(head != null){
			runner = head;
			while(runner.next != null){
				if(runner.next.val == head.val){
					runner.next = runner.next.next;
				} else {
					runner = runner.next;
				}
			}
			head = head.next;
		}
		
		return headCopy;
	}
	
	//2.2
	public int findNth(ListNode head, int n){
		
		ListNode headCopy = head;
		
		for(int i = 0; i < n; i++){
			head = head.next;
		}
		
				
		while(head != null){
			headCopy = headCopy.next;
			head = head.next;
		}
		
		return headCopy.val;
	}
	
	//2.3
	public void deleteMiddleNode(ListNode head){
		
	}
	
}