package leetCode;

import structure.ListNode;

public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null)
        	return head;
       
    	int len = 0;
    	ListNode n0 = head;
    	while(n0 != null){
    		n0 = n0.next;
    		len++;
    	}
    	
    	k = k%len;
    	
    	if(k == 0)
    		return head;
    	
        ListNode n1 = head;
        for(int i = 0; i < k; i++){
        	n1 = n1.next;
        	
        	if(n1 == null)
        		n1 = head;
        }
        
        ListNode n2 = head;
        while(n1.next != null){
        	n1 = n1.next;
        	n2 = n2.next;
        }
        
        ListNode temp = n2.next;
        n2.next = null;
        n1.next = head;
        
        return temp;
    }
}
