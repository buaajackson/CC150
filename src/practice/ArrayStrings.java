package practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ArrayStrings {

	// 1.1
	public boolean isUnique(String str) {
		HashSet<Character> set = new HashSet<Character>();
		for (char item : str.toCharArray()) {
			if (set.contains(item))
				return false;
			set.add(item);
		}
		return true;
	}

	// 1.1
	public boolean isUniqueOptimize(String str) {
		if (str == null || str.length() == 0)
			return true;

		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j))
					return false;
			}
		}
		return true;
	}

	// 1.3
	public String removeDuplicates(String str) {
		char[] arr = str.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != ' ') {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] == arr[j] && arr[i] != ' ') {
						arr[j] = ' ';
					}
				}
			}
		}


		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == ' ') {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[j] != ' ') {
						arr[i] = arr[j];
						arr[j] = ' ';
						break;
					}
				}
			}
		}
		return new String(arr).trim();
	}
	
	//1.4
	public boolean isAnagram(String a, String b){
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(char i : a.toCharArray()){
			if(map.containsKey(i)){
				map.put(i, map.get(i)+1);
			} else{
				map.put(i, 1);
			}
		}
		
		for(char i : b.toCharArray()){
			if(map.containsKey(i)){
				map.put(i, map.get(i)-1);
			} else {
				return false;
			}
		}
		
		for(char i : map.keySet()){
			if(map.get(i) != 0)
				return false;
		}
		return true;
	}
	
	//1.4
	public boolean isAnagramSort(String a, String b){
		char[] arrayA = a.toCharArray();
		char[] arrayB = b.toCharArray();
		Arrays.sort(arrayA);
		Arrays.sort(arrayB);
		
		return Arrays.equals(arrayA, arrayB);
	}
	
	//1.5
	public String replaceSpace(String a){
		char[] arr = a.toCharArray();
		
		int index = arr.length-1;
		while(a.charAt(index) == ' '){
			index--;
		}
		
		int end = arr.length-1;
		for(int i = index; i >= 0; i--){
			if(arr[i] != ' '){
				arr[end] = arr[i];
				end--;
			} else {
				arr[end] = '0';
				arr[--end] = '2';
				arr[--end] = '%';
				end--;
			}
		}
		return new String(arr);
	}
	
	//1.6
	public char[][] rotateMatrix(char[][] matrix){
		
	}
	
	

	

	

	

	

	

	

	

	
	
}
