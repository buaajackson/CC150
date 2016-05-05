package year2016;

public class MergeSortedArray {
	
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		if(m == 0){
		    nums1 = nums2.clone();
		    return;
		}
	    
	    if(n == 0)
	        return;

	    int len = m+n-1;
	    while(m-1 >= 0 && n-1 >= 0){
	    	if(nums1[m-1] > nums2[n-1]){
	    		nums1[len] = nums1[m-1];
	    		m--;
	    		len--;
	    	}
	    	else {
	    		nums1[len] = nums2[n-1];
	    		n--;
	    		len--;
	    	}
	    }
	    
	    while(n-1 >= 0){
	    	nums1[len] = nums2[n-1];
	    	len--;
	    	n--;
	    }
    }
}
