package TDD;

import leetCode.*;

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
	
	@Test
	public void testNumberPalindrome(){
		NumberPalindrome p = new NumberPalindrome();
		Assert.assertTrue(p.numberPalindrome(12344321));
		Assert.assertTrue(p.numberPalindrome(1234321));
		Assert.assertFalse(p.numberPalindrome(12332));
		Assert.assertFalse(p.numberPalindrome(10));
	}
	
	@Test
	public void testValidPalindrome(){
		ValidPalindrome vp = new ValidPalindrome();
		vp.isPalindrome(".a");
	}
}
