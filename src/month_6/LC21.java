package month_6;
//714. 买卖股票的最佳时机含手续费
public class LC21 {
    public int maxProfit(int[] prices, int fee) {
        if(prices.length <= 1) return 0;
        int[] dp = new int[2];
        dp[0]=0;
        dp[1]=-prices[0];
        for (int i = 1; i < prices.length; i++) {
            dp[0]=Math.max(dp[0],dp[1]+prices[i]-fee);
            dp[1]=Math.max(dp[1],dp[0]-prices[i]);
        }
        return dp[0];
    }
}
