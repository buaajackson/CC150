package practice;

import java.util.ArrayList;

public class Recursion {

	//8.3 Subset
	public ArrayList<ArrayList<String>> getSubSet(ArrayList<String> input){
		if(input == null || input.size() == 0)
			return new ArrayList<ArrayList<String>>();
		
		return getSubSet(input, 0);
	}
	
	private ArrayList<ArrayList<String>> getSubSet(ArrayList<String> input, int index){
		ArrayList<ArrayList<String>> returnList;
		if(input.size() == index){
			returnList = new ArrayList<ArrayList<String>>();
			ArrayList<String> set = new ArrayList<String>();
			returnList.add(set);
			return returnList;
		} else {
			returnList = getSubSet(input, index+1);
			String current = input.get(index);
			ArrayList<ArrayList<String>> newList = new ArrayList<ArrayList<String>>();
			newList.addAll(returnList);
			for(ArrayList<String> item : returnList){
				ArrayList<String> secondSet = new ArrayList<String>();
				secondSet.addAll(item);
				secondSet.add(current);
				newList.add(secondSet);
			}
			return newList;
		}
	}
	
	//8.4 Permutation
	public ArrayList<String> getPermutation(String input){
		if(input == null || input == ""){
			return null;
		}
		
		return getPermutation(input, 0);
	}
	
	private ArrayList<String> getPermutation(String input, int index){
		ArrayList<String> result;
		if(input.length() == index+1){
			result = new ArrayList<String>();
			result.add(String.valueOf(input.charAt(index)));
			return result;
		} else {
			result = getPermutation(input, index+1);
			char current = input.charAt(index);
			ArrayList<String> output = new ArrayList<String>();
			for(String item : result){
				for(int i = 0; i <= item.length(); i++){
					output.add(consistString(item, current, i));
				}
			}
			return output;
		}
	}
	
	private String consistString(String str, char cha, int index){
		return str.substring(0, index) + cha + str.substring(index);
	}
	
	public void printParenthesis(int num){
		if(num <= 0)
			return;
		
		printParenthesis(num, 0, 0, new char[num*2], 0);
	}
	
	private void printParenthesis(int num, int left, int right, char[] arr, int index){
		if(left == num && right == num)
			System.out.println(new String(arr));
		else{
			if(left < num){
				arr[index] = '(';
				printParenthesis(num, left+1, right, arr, index+1);
			}
			if(left > right){
				arr[index] = ')';
				printParenthesis(num, left, right+1, arr, index+1);
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
