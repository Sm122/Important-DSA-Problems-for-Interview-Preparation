class Solution {
    public int maxProfit(int k, int[] prices) {
        if(prices.length==0 || prices.length==1)
            return 0;
        int n = prices.length;
       int profit[][] =new int[k+1][n+1];
        for(int i =0;i<=k;i++)
            profit[i][0]=0;
        for(int j =0;j<=n;j++)
            profit[0][j]=0;
        for(int a = 1;a<=k;a++)
        {
            int prev=Integer.MIN_VALUE;
            for(int b=1;b<n;b++)
            {
                prev=Math.max(prev,profit[a-1][b-1]-prices[b-1]);
                profit[a][b]=Math.max(profit[a][b-1],prices[b]+prev);
                
            }
        }
        return profit[k][n-1];
    }
}
