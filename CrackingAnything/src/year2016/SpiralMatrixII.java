package year2016;

public class SpiralMatrixII {

    public int[][] generateMatrix(int n) {
    	int[][] result = new int[n][n];
    	
    	if(n == 0)
    		return result;
    	
    	int index = 1;
    	int x = 0;
    	int y = 0;
    	
    	while(index <= n*n){
    		while(y+1<n && result[x][y+1] == 0){
    			result[x][y+1] = ++index;
    			y++;
    		}
    		
    		while(x+1 < n && result[x+1][y] == 0){
    			result[x+1][y] = ++index;
    			x++;
    		}
    		
    		while(y-1>0 && result[x][y-1] == 0){
    			result[x][y-1] = ++index;
    			y--;
    		}
    		
    		while(x-1 > 0 && result[x-1][y] == 0){
    			result[x-1][y] = ++index;
    			x--;
    		}
    	}
    	
    	return result;
    }
}
