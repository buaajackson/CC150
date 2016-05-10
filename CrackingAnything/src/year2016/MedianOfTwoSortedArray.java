package year2016;

public class MedianOfTwoSortedArray {

	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int m = nums1.length;
		int n = nums2.length;
		
		if((m+n)%2 == 0){
			return (find(nums1, 0, m, nums2, 0, n, (m+n)/2) + find(nums1, 0, m, nums2, 0, n, (m+n)/2-1))/2;
		} else {
			return find(nums1, 0, m, nums2, 0, n, (m+n)/2);
		}
    }
	
	private double find(int[] m, int mStart, int mEnd, int[] n, int nStart, int nEnd, int k){
		if((mEnd - mStart) < 0)
			return n[nStart + k];
		else if((nEnd - nStart) < 0)
			return m[mStart+k];
		else if(k == 0)
			return Math.min(m[mStart], n[nStart]);
		
		int midM = (mEnd - mStart + 1) * k / (nEnd - nStart + mEnd - mStart + 2);
		int midN = k - midM;
		
		midM += mStart;
		midN += nStart;
		
		if(m[midM] > n[midN]){
			mEnd = midM-1;
			nStart = midN + 1;
			k = k - (midN-nStart+1);
		} else {
			mStart = midM + 1;
			nEnd = midN - 1;
			k = k - (midM - mStart + 1);
		}
		
		return find(m, mStart, mEnd, n, nStart, nEnd, k);
	}
}
