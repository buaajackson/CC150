package year2016;

import structure.ListNode;

public class IntersectionOfLinkedlist {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null)
        	return null;
        
        ListNode a = headA;
        ListNode b = headB;
        int m = 0;
        int n = 0;
        while(a != null){
        	m++;
        	a = a.next;
        }
        while(b != null){
        	n++;
        	b = b.next;
        }
        
        if(m > n){
        	for(int i = 0; i < m-n; i++){
        		headA = headA.next;
        	}
        } else {
        	for(int i = 0; i < n-m; i++){
        		headB = headB.next;
        	}
        }
        
        while(!headA.equals(headB)){
        	headA = headA.next;
        	headB = headB.next;
        	
        	if(headA == null || headB == null){
        		return null;
        	}
        }
        return headA;
    }
}
