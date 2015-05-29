package leetCode;

public class ValidPalindrome {

	public boolean isPalindrome(String s){
		s = s.replaceAll("[^a-zA-Z]", "").toLowerCase();
		
		if(s == null || s.length() == 0)
			return true;
		
		int head = 0;
		int tail = s.length() - 1;
		
		while(head <= tail){
			if(s.charAt(head) != s.charAt(tail))
				return false;
			head++;
			tail--;
		}
		return true;
	}
	
/*	private int skipInvalidChar(String s, int index, boolean isForward){
		if(s.charAt(index) >= '0')
	}*/
}
