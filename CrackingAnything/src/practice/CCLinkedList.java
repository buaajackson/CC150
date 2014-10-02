package practice;

import java.util.*;
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
}
