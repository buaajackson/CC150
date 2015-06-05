package leetCode;

public class RotateImage {
	public void rotate(int[][] matrix) {
		if(matrix == null || matrix.length == 0 || matrix[0].length == 0)
			return;
		
		int n = matrix.length;
		
		for(int i = 0; i < n/2; i++){
			for(int j = 0; j < n; j++){
				int temp = matrix[j][i];
				matrix[j][i] = matrix[j][n-1-i];
				matrix[j][n-1-i] = temp;
			}
		}
		
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n-i; j++){
				int temp = matrix[i][j];
				matrix[i][j] = matrix[n-1-j][n-1-i];
				matrix[n-1-j][n-1-i] = temp;
			}
		}
    }
}
