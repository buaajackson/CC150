package TDD;

import org.junit.*;
import practice.ArrayStrings;

public class TestArrayStrings {

	ArrayStrings arrayString;
	
	@Before
	public void initialization(){
		arrayString = new ArrayStrings();
	}
	
	@Test
	public void isStringCharUnique(){ 
		Assert.assertTrue(arrayString.isUnique("asdfqwer"));
		Assert.assertFalse(arrayString.isUnique("asdfqwera"));
		Assert.assertTrue(arrayString.isUniqueOptimize("asdfghjqwertyui"));
	}
	
	@Test
	public void removeDuplicates(){
		Assert.assertEquals("abcde", arrayString.removeDuplicates("aabbccdddde"));
	}
	
	@Test
	public void isAnagram(){
		Assert.assertTrue(arrayString.isAnagram("ababababc", "caaaabbbb"));
		Assert.assertFalse(arrayString.isAnagram("abababab", "caaaabbbb"));
		
		Assert.assertTrue(arrayString.isAnagramSort("ababababc", "caaaabbbb"));
		Assert.assertFalse(arrayString.isAnagramSort("abababab", "caaaabbbb"));
	}
	
	@Test
	public void replaceSpace() {
		Assert.assertEquals("a%20b%20c", arrayString.replaceSpace("a b c    "));
		Assert.assertEquals("a%20%20b%20c", arrayString.replaceSpace("a  b c      "));
	}
}

