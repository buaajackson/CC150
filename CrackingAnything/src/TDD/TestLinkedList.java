package TDD;

import java.util.Collection;

import org.junit.*;

import practice.CCLinkedList;
import structure.ListNode;

public class TestLinkedList {

	private CCLinkedList linkedList;
	ListNode a;
	ListNode a_c;
	
	@Before
	public void init(){
		linkedList = new CCLinkedList();
		ListNode e = new ListNode(5);
		ListNode d = new ListNode(4, e);
		ListNode c = new ListNode(3, d);
		ListNode b = new ListNode(2, c);
		a = new ListNode(1, b);
		
		ListNode f_c = new ListNode(5);
		ListNode e_c = new ListNode(5, f_c);
		ListNode d_c = new ListNode(4, e_c);
		ListNode c_c = new ListNode(3, d_c);
		ListNode c_c_c = new ListNode(3, c_c);
		ListNode b_c = new ListNode(2, c_c_c);
		a_c = new ListNode(1, b_c);
	}
	
	@Test
	public void removeDuplicates(){
		Assert.assertTrue(compareListNode(a, linkedList.removeDuplicates(a_c)));
		
	}
	
	private boolean compareListNode(ListNode a, ListNode b){
		while(a != null){
			if(b == null)
				return false;
			else if(a.val != b.val)
				return false;
			a = a.next;
			b = b.next;
		}
		if(b != null)
			return false;
		return true;
	}
	
	@Test
	public void removeDuplicatesWithoutMem(){
		Assert.assertTrue(compareListNode(a, linkedList.removeDuplicatesWithoutMem(a_c)));
	}
	
	@Test
	public void findNth(){
		Assert.assertEquals(4, linkedList.findNth(a,  2));
	}
	
	@Test
	public void removeMiddleNode(){
		ListNode e = new ListNode(5);
		ListNode d = new ListNode(4, e);
		ListNode b = new ListNode(2, d);
		ListNode expected = new ListNode(1, b);
		
		Assert.assertTrue(compareListNode(expected, linkedList.deleteMiddleNode(a, 2)));
	}
	
	@Test
	public void sumOfLinkedlist(){
		ListNode b = new ListNode(9);
		ListNode one = new ListNode(9, b);
		
		ListNode c = new ListNode(3);
		ListNode two = new ListNode(5, c);
		
		ListNode e = new ListNode(1);
		ListNode d = new ListNode(3, e);
		ListNode expected = new ListNode(4, d);
		
		Assert.assertTrue(compareListNode(expected, linkedList.sumOfLinkedList(one, two)));
		
	}
}
