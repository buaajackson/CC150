package year2016;

public class InterleavingString {
	public boolean isInterleave(String s1, String s2, String s3) {
		if((s1.length() == 0 && s2.length() == 0 && s3.length() == 0) || (s1.length() == 0 && s2.equals(s3)) || (s2.length() == 0 && s1.equals(s3)))
			return true;
		else if(s1.length() == 0 || s2.length() == 0 || s3.length() == 0)
			return false;
		
		int p1 = 0;
		int p2 = 0;
		int p3 = 0;
		
		while(p1 < s1.length() && p2 < s2.length()){
			if(s1.charAt(p1) == s3.charAt(p3)){
				p1++;
				p3++;
			} else if (s2.charAt(p2) == s3.charAt(p3)){
				p2++;
				p3++;
			} else {
				return false;
			}
		}
		
		if(p1 < s1.length()){
			return s1.substring(p1).equals(s3.substring(p3));
		}
		
		if(p2 < s2.length()){
			return s2.substring(p2).equals(s3.substring(p3));
		}
		
		return true;
    }
}
