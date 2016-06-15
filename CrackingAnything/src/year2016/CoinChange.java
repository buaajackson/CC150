package year2016;

public class CoinChange {
    public int coinChange(int[] coins, int amount) {
<<<<<<< HEAD
        if(coins == null || coins.length == 0)
        	return 0;
        
        int[] result = new int[amount+1];
        result[0] = 0;
        for(int i = 1; i < result.length; i++)
        	result[i] = Integer.MAX_VALUE;
        
        for(int i = 1; i < result.length; i++){
        	for(int coin : coins){
        		if(i + coin <= amount){
        			result[i+coin] = Math.min(result[i+coin], result[i] == Integer.MAX_VALUE ? Integer.MAX_VALUE : result[i]+1);
        		}
        	}
        }
        return result[amount] == Integer.MAX_VALUE ? -1 : result[amount];
=======
        int[] dp = new int[amount];
        change(coins, dp, amount);
    }
    
    private void change(int[] coins, int[] dp, int remain){
    	if(remain == 0)
    		return 
>>>>>>> b05f51420b7878fc7dd6ba69b7ff58de06c2911f
    }
}
