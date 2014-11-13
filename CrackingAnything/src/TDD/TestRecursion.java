package TDD;
import java.util.ArrayList;

import org.junit.*;

import practice.Recursion;

public class TestRecursion {

	private Recursion recur;
	
	@Before
	public void init(){
		recur = new Recursion();
	}
	
	@Test
	public void testSubSet(){
		ArrayList<String> a = new ArrayList<String>();
		a.add("a");
		a.add("b");
		a.add("c");

		ArrayList<ArrayList<String>> result = recur.getSubSet(a);
		
		
	}
	
	@Test
	public void testPermutation(){
		ArrayList<String> result = recur.getPermutation("abc");
	}
	
	@Test
	public void testPrintParenthesis(){
		recur.printParenthesis(3);
	}
	
}
