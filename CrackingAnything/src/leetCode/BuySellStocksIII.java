package leetCode;

public class BuySellStocksIII {
/*
	public int maxProfit(int[] prices) {
        
		int len = prices.length;
		if(prices == null || len == 0 || len == 1)
        	return 0;
		
		int firstMax = 0;
		int secondMax = 0;
        for(int i = 0; i < len; i++){
        	firstMax = getMaxProfit(prices, 0, i);
        	secondMax = getMaxProfit(prices, i, len-1);
        }
        
        return firstMax + secondMax;
    }
	
	private int getMaxProfit(int[] prices, int start, int end){
		int min = prices[start];
		int max = 0;
		for(int i = start+1; i <=end; i++){
			if(prices[i] < min)
				min = prices[i];
			
			if(prices[i] - min > max)
				max = prices[i] - min;
		}
		
		return max;
	}
*/
	public int maxProfit(int[] prices) {
		int len = prices.length;
		if(prices == null || len == 0 || len == 1)
        	return 0;
		
		int[] maxFromLeft = new int[len];
		int minFromLeft = prices[0];
		for(int i = 1; i < len; i++){
			
			maxFromLeft[i] = Math.max(prices[i] - minFromLeft, maxFromLeft[i-1]);
			
			if(prices[i] < minFromLeft)
				minFromLeft = prices[i];
		}
		
		int[] maxFromRight = new int[len];
		int max = prices[len-1];
		for(int i = len-2; i>= 0; i--){
			maxFromRight[i] = Math.max(max - prices[i], maxFromRight[i+1]);
			if(prices[i] > max){
				max = prices[i];
			}
		}
		
		int result = 0;
		for(int i = 0; i < len; i++){
			int temp = maxFromLeft[i] + maxFromRight[i];
			if(temp > result)
				result = temp;
		}
		
		return result;
	}
}
