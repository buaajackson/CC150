package leetCode;

public class TrappingWater {

    public int trap(int[] height) {
        if(height.length == 0)
            return 0;
        
        int[] left = new int[height.length];
        int[] right = new int[height.length];
        int max = height[0];
        int result = 0;
        
        for(int i = 1; i < height.length; i++){
            left[i] = max;
            
            if(max < height[i])
                max = height[i];
        }
        
        max = height[height.length - 1];
        for(int i = height.length - 2; i >= 0; i--){
            right[i] = max;
            
            int temp = Math.min(left[i], right[i]) - height[i];
            if(temp > 0)
                result += temp;
                
            if(max < height[i])
                max = height[i];
        }
        return result;
    }
}
