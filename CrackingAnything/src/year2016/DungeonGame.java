package year2016;

public class DungeonGame {
    public int calculateMinimumHP(int[][] dungeon) {
        if(dungeon == null || dungeon.length == 0)
        	return 0;
        
        int m = dungeon.length;
        int n = dungeon[0].length;
        int[] result = new int[n];
        
        for(int i = m-1; i >= 0; i--){
        	for(int j = n-1; j >= 0; j--){
        		if(j+1 >= n){
        			result[j] += dungeon[i][j];
        		}
        		else if(i == m-1){
        			result[j] = result[j+1] + dungeon[i][j];
        		}
        		else {
        			result[j] = Math.min(result[j+1], result[j]) + dungeon[i][j];
        		}
        	}
        }
        return 1-result[0] < 1 ? 1 : 1-result[0];
    }
}
