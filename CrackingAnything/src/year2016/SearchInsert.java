package year2016;

public class SearchInsert {
    public int searchInsert(int[] A, int target) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        if(A.length == 0)
            return 0;
        
        int start = 0;
        int end = A.length-1;
        while(start <= end){
            int mid = (start+end)/2;
            if(target == A[mid]){
                return mid;
            } else if(target < A[mid]){
                if(start < mid){
                    end = mid - 1;
                } else {
                    return start;
                }
            } else {
                if(mid < end){
                    start = mid + 1;
                } else {
                    return end;
                }
            }
        }
        return 0;
    }
}
