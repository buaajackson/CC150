package year2016;

import structure.ListNode;

public class ReverseLinkedlist {
    public ListNode reverseBetween(ListNode head, int m, int n) {
    	ListNode fakeHead = new ListNode(0);
    	fakeHead.next = head;
    	
    	ListNode node1 = fakeHead;
    	ListNode node2 = fakeHead;
    	for(int i = 0; i < m-1; i++){
    		node1 = node1.next;
    	}
    	for(int i = 0; i < n; i++){
    		node1 = node1.next;
    	}
    	
    	ListNode start = node1.next;
    	ListNode end = node2.next;
    	node2.next = null;
    	
    	ListNode fakeStart = start;
    	ListNode pre = null;
    	//start & node2
    	while(start != null){
    		ListNode next = start.next;
    		start.next = pre;
    		pre = start;
    		start = next;
    	}
    	
    	node1.next = pre;
    	fakeStart.next = end;
    	
    	return fakeHead.next;
    }
}
