package TDD;

import org.junit.*;

import practice.Sorting;

public class TestSorting {
	
	Sorting sort;
	
	@Before
	public void init(){
		sort = new Sorting();
	}
	
	@Test
	public void testGetItemFromRotatedArray(){
		int[] arr = {5,6,7,8,1,2,3,4};
		
		Assert.assertEquals(7, sort.getItemFromRotatedArray(arr, 0, arr.length-1, 4));
		Assert.assertEquals(4, sort.getItemFromRotatedArray(arr, 0, arr.length-1, 1));
		
		int[] arr2 = {1,1,1,1,1};
		Assert.assertEquals(-1, sort.getItemFromRotatedArray(arr, 0, arr2.length-1, 2));
	}
	
	@Test
	public void testSearchFromSparseArray(){
		String[] array = {"", "a", "b", "", "", "c", "", "", "", "d"};
		int index = sort.searchFromSparseArray(array, "d");
		Assert.assertEquals(9, index);
	}
}
