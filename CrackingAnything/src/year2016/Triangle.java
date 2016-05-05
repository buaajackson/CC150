package year2016;

import java.util.List;

public class Triangle {
	public int minimumTotal(List<List<Integer>> triangle) {
		if(triangle == null || triangle.size() == 0){
			return 0;
		}
		
		int row = triangle.size();
		int[] min = new int[triangle.get(row-1).size()];
		for(int i = row-1; i >= 0; i--){
			int col = triangle.get(i).size();
			for(int j = 0; j < col; j++){
				if(i == row-1){
					min[j] = triangle.get(i).get(j);
					continue;
				}
				
				min[j] = Math.min(min[j], min[j+1]) + triangle.get(i).get(j);
			}
		}
		return min[0];
	}
}
