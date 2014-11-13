package TDD;

import leetCode.MinStack;

import org.junit.*;

public class TestLeetCode {

	@Test
	public void testMinStack(){
		//push(512),push(-1024),push(-1024),push(512),pop,getMin,pop,getMin,pop,getMin
		
		MinStack ms = new MinStack();
		ms.push(512);
		ms.push(-1024);
		ms.push(-1024);
		ms.push(512);
		
		ms.pop();
		Assert.assertEquals(-1024, ms.getMin());
		ms.pop();
		Assert.assertEquals(-1024, ms.getMin());
		ms.pop();
		Assert.assertEquals(512, ms.getMin());		
	}
}
