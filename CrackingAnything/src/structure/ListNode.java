package structure;

public class ListNode {
	public int val;
	public ListNode next;
	
	public ListNode(int v, ListNode n){
		this.val = v;
		this.next = n;
	}
	
	public ListNode(int v){
		this.val = v;
		this.next = null;
	}
}
