package leetCode;

public class Palindrome {

	public boolean numberPalindrome(int x){
		int div = 1;
		int numCopy = x;
		while(numCopy/10 > 0){
			div *= 10;
			numCopy /= 10;
		}
		
		while(x != 0){
			int first = x/div;
			int last = x%10;
			if(first != last)
				return false;
			x = x%div;
			x /= 10;
			div /=100;
		}
		return true;
	}
}
