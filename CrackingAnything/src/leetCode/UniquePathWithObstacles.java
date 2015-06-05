package leetCode;

public class UniquePathWithObstacles {
	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
		
		int m = obstacleGrid.length;
		
		if(m == 0 || obstacleGrid[0].length == 0)
			return 0;
		
        int n = obstacleGrid[0].length;
        
        int[] known = new int[m*n];
        
        return search(obstacleGrid, known, m, n, 0, 0);
    }
	
	private int search(int[][] grid, int[] known, int m, int n, int x, int y){
		if(y >= m || x >= n)
			return 0;
		else if(grid[y][x] == 1)
			return 0;
		
		if(x == n-1 && y == m-1)
			return 1;
		if(known[y*n+x] != 0)
			return known[y*n + x];
		int result = search(grid, known, m, n, x+1, y) + search(grid, known, m, n, x, y+1);
		known[y*n+x] = result;
		return result;
	}
	
	public int uniquePath(int[][] obstacleGrid){
		int m = obstacleGrid.length;
		if(m == 0)
			return 0;
		
        int n = obstacleGrid[0].length;
        if(n == 0)
        	return 0;
        
        int[] data = new int[n];
        data[n-1] = 1;
        
        for(int i = m-1; i >= 0; i--){
        	for(int j = n-1; j >= 0; j--){
        		if(obstacleGrid[i][j] == 1){
        			data[j] = 0;
        			continue;
        		}
        		if(j+1 < n)
        			data[j] = data[j+1] + data[j];
        	}
        }
        return data[0];
	}
}
