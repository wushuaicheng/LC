package month_6;

public class LC20 {
    /*public int maxProfit(int k, int[] prices) {
        if(prices.length <= 1 || k == 0) return 0;
        if(k/2>=prices.length) k =prices.length;
        int[][][] dp = new int[prices.length][k+1][2];
        for (int i = 0; i < k+1 ; i++) {
            dp[0][i][0]=0;
            dp[0][i][1]=-prices[0];
        }
        for(int i=1;i<prices.length;i++) {
            for(int j=1;j<=k;j++) {
               dp[i][j][0]=Math.max(dp[i-1][j][0],dp[i-1][j][1]+prices[i]);
               dp[i][j][1]=Math.max(dp[i-1][j][1],dp[i-1][j-1][1]-prices[i]);
            }
        }
        return dp[prices.length-1][k][0];
    }*/
    public int maxProfit(int k, int[] prices) {
        if(prices.length <= 1 || k == 0) return 0;
        if(k/2>=prices.length) k =prices.length;
        int[][] dp = new int[k+1][2];
        for (int i = 1; i <= k ; i++) {
            dp[i][0]=0;
            dp[i][1]=-prices[0];
        }
        for(int i=1;i<prices.length;i++) {
            for (int j = 1; j <=k ; j++) {
                dp[j][0]=Math.max(dp[j][0],dp[j][1]+prices[i]);
                dp[j][1]=Math.max(dp[j][1],dp[j-1][0]-prices[i]);
            }
        }
        return dp[k][0];
    }
}
