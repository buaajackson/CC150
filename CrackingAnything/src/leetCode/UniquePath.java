package leetCode;

public class UniquePath {
	public int uniquePaths(int m, int n) {
        if(m <= 0 || n <= 0)
        	return 0;
        
        return findPath(m, n, 0, 0);
    }
	
	private int findPath(int m, int n, int x, int y){
		if(x == n-1 && y == m-1)
			return 1;
		
		if(x >= n || y >= m)
			return 0;
		
		//go right
		int right = findPath(m, n, x+1, y);
		
		//go down
		int down = findPath(m, n, x, y+1);
		
		return right + down; 
	}
}
