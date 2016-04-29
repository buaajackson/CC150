package year2016;

import structure.ListNode;

public class SumOfLinklists {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null || l2 == null)
        	return null;
        
        ListNode result =  new ListNode(0);
        ListNode current = result;
        int carryOver = 0;
        while(l1 != null || l2 != null) {
        	int sum = carryOver;
        	if(l1 != null){
        		sum += l1.val;
        		l1 = l1.next;
        	}
        	
        	if(l2 != null){
        		sum += l2.val;
        		l2 = l2.next;
        	}
        	
        	carryOver = sum/10;
        	current.next = new ListNode(sum%10);
        	current = current.next;
        }
        
        if(carryOver != 0){
        	current.next = new ListNode(carryOver);;
        }
        
        return result.next;
    }
}
