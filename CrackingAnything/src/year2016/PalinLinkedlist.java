package year2016;
import structure.ListNode;

public class PalinLinkedlist {

    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null)
        	return true;
        
        ListNode fast = head;
        ListNode slow = head;
        
        while(fast != null && fast.next != null){
        	fast = fast.next.next;
        	slow = slow.next;
        }
        
        ListNode pre = null;
        while(slow != null){
        	ListNode temp = slow.next;
        	slow.next = pre;
        	pre = slow;
        	slow = temp;
        }
        
        while(pre != null && head != null){
        	if(pre.val != head.val){
        		return false;
        	}
        	pre = pre.next;
        	head = head.next;
        }
        
        if(pre != null)
        	return false;
        
        return true;
    }	
}
