package leetCode;

public class MiniPathSum {
	public int minPathSum(int[][] grid) {
        int m = grid.length;
		if(grid == null || m == 0)
			return 0;
		
		int n = grid[0].length;
		if(n == 0)
			return 0;
		
		int[][] sum = new int[m][n];
		for(int i = m-1; i >= 0; i--){
			if(i == m-1)
				sum[i][n-1] = grid[i][n-1];
			else
				sum[i][n-1] = grid[i][n-1] + sum[i+1][n-1];
		}
		for(int i = n-1; i >= 0; i--){
			if(i == n-1)
				sum[m-1][i] = grid[m-1][i];
			else
				sum[m-1][i] = grid[m-1][i] + sum[m-1][i+1];
		}
		
		for(int j = m-2; j >= 0; j--){
			for(int i = n-2; i >= 0; i--){
				sum[j][i] = Math.min(sum[j][i+1], sum[j+1][i]) + grid[j][i];
			}
		}
		return sum[0][0];
		
    }
	
}
