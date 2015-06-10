package leetCode;

import java.util.Stack;

public class MaxRectangle {
    public int maximalRectangle(char[][] matrix) {
        int m = matrix.length;
        if(m == 0)
        	return 0;
        int n = matrix[0].length;
        if(n == 0)
        	return 0;
    	
    	int[][] compress = new int[m][n];
    	for(int i = 0; i < matrix.length; i++){
    		for(int j = 0; j < matrix[0].length; j++){
    			if(i == 0){
    				compress[i][j] = matrix[i][j] - '0';
    			} else {
    				compress[i][j] = matrix[i][j] == '0' ? 0 : (matrix[i-1][j] + matrix[i][j] - '0');
    			}
    		}
    	}
    	
    	int result = 0;
    	for(int i = 0; i < m; i++){
    		result = Math.max(result, largestRectangleArea(compress[i]));
    	}
    	return result;
    }
    
	public int largestRectangleArea(int[] height) {
        
		Stack<Integer> stack = new Stack<Integer>();
        int sum = 0;
        
        int[] arr = new int[height.length + 1];
        for(int i = 0; i < height.length; i++){
            arr[i] = height[i];
        }
        arr[height.length] = 0;
        
        for(int i = 0; i < arr.length; ){
        	if(stack.isEmpty() || arr[i] > arr[stack.peek()]){
        		stack.push(i);
        		i++;
        	} else {
        		int current = stack.pop();
        		sum = Math.max(sum, arr[current] * (stack.isEmpty() ? i : i - stack.peek() - 1));
        	}
        }
        return sum;
    }
}
