package year2016;

public class MedianOfTwoSortedArray {

	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int m = nums1.length;
		int n = nums2.length;
		
		if(m == 0 && n == 0)
			return 0.0;
		
		if((m+n)%2 == 0){
			return (find(nums1, 0, m, nums2, 0, n, (m+n)/2) + find(nums1, 0, m, nums2, 0, n, (m+n)/2+1))/2;
		} else {
			return find(nums1, 0, m, nums2, 0, n, (m+n)/2+1);
		}
    }
	
	private double find(int[] m, int mStart, int mEnd, int[] n, int nStart, int nEnd, int k){
		if((mEnd - mStart) <= 0)
			return n[k-1];
		if((nEnd - nStart) <= 0)
			return m[k-1];
		if(k <= 1)
			return Math.min(m[mStart], n[nStart]);
		
		int halfM = (mEnd-mStart)/2;
		int halfN = (nEnd-nStart)/2;
		if(m[halfM] >= n[halfN]){
			if((halfM + halfN + 1) >= k)
				return find(m, halfM, mEnd, n, nStart, nEnd, k-halfM);
			else
				return find(m, mStart, mEnd, n, halfN, nEnd, k-halfN);
		} else {
			if((halfM + halfN + 1) >= k){
				return find(m, mStart, mEnd, n, halfN, nEnd, k-halfN);
			} else {
				return find(m, halfM, mEnd, n, nStart, nEnd, k-halfM);
			}
		}
	}
}
