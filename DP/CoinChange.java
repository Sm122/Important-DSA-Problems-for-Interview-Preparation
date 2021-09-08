class Solution {
    public int coinChange(int[] coins, int amount) {
        int n =coins.length;
      int dp[] = new int[amount+1];
      dp[0]=0;
      for(int k =1;k<=amount;k++)
          dp[k]=Integer.MAX_VALUE;
      for(int i =1;i<=amount;i++)
      {
          for(int j=0;j<n;j++)
          {
              if(coins[j]<=i)
              {
                 int sub = dp[i-coins[j]]; 
                  if(sub!=Integer.MAX_VALUE)
                      dp[i]=Math.min(dp[i],sub+1);
              }
          }
      }
      return dp[amount]!=Integer.MAX_VALUE?dp[amount]:-1;  
    }
}
