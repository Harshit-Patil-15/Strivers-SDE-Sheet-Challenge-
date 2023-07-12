class Solution {
    public int helper(int[] coins,int n,int amount,int[][] dp){
        if(n==0) {
           if(amount%coins[n]==0) return amount/coins[0];
           return (int)1e9;
        }
        if(dp[n][amount]!=-1) return dp[n][amount];
        int notPick=0+helper(coins,n-1,amount,dp);
        int pick= (int)1e9;
        if(coins[n]<=amount){
            pick=1+helper(coins,n,amount-coins[n],dp);
        }
        return dp[n][amount]= Math.min(pick,notPick);
    }
    public int coinChange(int[] coins, int amount) {
       int n=coins.length;
         int[][] dp = new int[n][amount+1];
       for(int i = 0 ; i < n ; i ++)
            for(int j = 0 ; j <= amount ; j++)
                dp[i][j] = -1;

      int ans= helper(coins,n-1,amount,dp);
       if(ans>=1e9){
           return -1;
       }
       return ans;
    }
}