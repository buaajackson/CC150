package leetCode;

import java.util.Stack;

public class LargestRectangleInHistogram {
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
