package leetCode;

import structure.ListNode;

public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null)
        	return head;
        
        ListNode cur = head;
        while(cur.next != null){
        	if(cur.next.val == val)
        		cur.next = cur.next.next;
        	else
        		cur = cur.next;
        }
        
        if(head.val == val){
        	return head.next;
        }
        return head;
    }
}
