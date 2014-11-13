package TDD;

import java.util.Stack;

import junit.framework.Assert;

import org.junit.Test;

import practice.StackQueue;
import structure.MinStack;
import structure.QueueBasedOnStack;

public class TestStackQueue {

	@SuppressWarnings("deprecation")
	@Test
	public void getMin(){
		MinStack stack = new MinStack();
		stack.push(10);
		Assert.assertEquals(10, (int)stack.getMin());
		
		stack.push(50);
		Assert.assertEquals(10, (int)stack.getMin());
		
		stack.push(10);
		Assert.assertEquals(10, (int)stack.getMin());
		
		stack.push(6);
		Assert.assertEquals(6, (int)stack.getMin());
		
		stack.push(103);
		Assert.assertEquals(6, (int)stack.getMin());
	}
	
	@Test
	public void StackBasedQueue(){
		QueueBasedOnStack queue = new QueueBasedOnStack();
		queue.push(10);
		queue.push(5);
		queue.push(23);
		queue.push(51);
		
		Assert.assertEquals(10, (int)queue.pop());
		Assert.assertEquals(5, (int)queue.pop());
		Assert.assertEquals(23, (int)queue.pop());
		Assert.assertEquals(51, (int)queue.pop());
	}
	
	@Test
	public void SortStack(){
		StackQueue sq = new StackQueue();
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		Stack<Integer> result = sq.sortStack(stack);
		
		Assert.assertEquals(1, (int)result.pop());
		Assert.assertEquals(2, (int)result.pop());
		Assert.assertEquals(3, (int)result.pop());
	}
}
