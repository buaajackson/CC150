package leetCode;

import structure.ListNode;

public class RemoveDupFromLinkedListII {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null)
        	return head;
        
        ListNode fakeHead = new ListNode(-1);
        fakeHead.next = head;
        ListNode n1 = fakeHead;
        
        while(n1.next != null){
        	ListNode n2 = n1.next;
        	while(n2.next != null && n2.next.val == n2.val){
        		n2 = n2.next;
        	}
        	
        	if(n1.next.equals(n2)){
        		n1 = n1.next;
        	} else {
        		n1 = n2.next;
        	}
        }
        return fakeHead.next;
        		
    }
}
