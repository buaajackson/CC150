package leetCode;

import structure.ListNode;

public class SwapNodes {
	public ListNode swapPairs(ListNode head) {
		
		ListNode fakeHead = new ListNode(0);
        fakeHead.next = head;
        ListNode n0 = fakeHead;
        ListNode n1 = head;
        
        while(n1 != null && n1.next != null){
        	ListNode temp = n1.next.next;
        	n1.next.next = n0.next;
        	n0.next = n1.next;
        	n1.next = temp;
        	
        	n0 = n1;
        	n1 = n1.next;
        	
        }
        
        return fakeHead.next;
    }
}
