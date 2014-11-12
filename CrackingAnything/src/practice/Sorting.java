package practice;

public class Sorting {

	//9.3
	public int getItemFromRotatedArray(int[] array, int left, int right, int x){
		
		while(left <= right){
			int mid = (left + right)/2;
			if(array[mid] == x)
				return mid;
			else if(array[mid] < x){
				if(x <= array[right]){
					left = mid+1;
				} else {
					right = mid-1;
				}
			} else if(array[mid] > x){
				if(array[left] <= x){
					right = mid-1;
				} else {
					left = mid+1;
				}
			}
		}
		
		return -1;
	}
	
	//9.5
	public int searchFromSparseArray(String[] array, String x){
		//border check
		if(array == null || array.length == 0)
			return -1;
		
		return searchFromSparseArray(array, x, 0, array.length-1);
	}
	
	private int searchFromSparseArray(String[] array, String x, int left, int right){
		while(left <= right){
			while(array[right] == ""){
				right--;
			}
			while(array[left] == ""){
				left++;
			}
			if(left > right)
				return -1;
			
			int mid = (left + right)/2;
			while(array[mid] == ""){
				mid++;
			}
			
			if(array[mid] == x){
				return mid;
			} else if(array[mid].compareTo(x) < 0){
				left = mid+1;
			} else {
				right = mid-1;
			}
		}
		return -1;
	}
	
	public int getLongestSequence(int[] array){
		int max = 0;
		for(int i = 1; i < array.length; i++){
			int count = 1;
			if(array[i] >= array[i-1]){
				count++;
			} else{
				if(count > max)
					max = count;
				count = 1;
			}
		}
		return max;
	}
}
  