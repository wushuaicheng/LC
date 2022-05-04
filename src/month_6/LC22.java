package month_6;
//309. 最佳买卖股票时机含冷冻期
public class LC22 {
    public static int maxProfit(int[] prices) {
        if(prices.length<=1) return 0;
        int[]dp = new int[3];
        dp[0]=0;
        dp[1]=-prices[0];
        dp[2]=0;
        int x;
        int y;
        int z;
        for (int i = 1; i < prices.length; i++) {
            x=Math.max(dp[0],dp[2]);
            y=Math.max(dp[1],dp[0]-prices[i]);
            z=dp[1]+prices[i];
            dp[0]=x;
            dp[1]=y;
            dp[2]=z;
        }
        return Math.max(dp[0],dp[2]);
    }
    public int maxProfit1(int[] prices) {
        if(prices.length<=1) return 0;
        int[][] dp = new int[prices.length + 1][3];
        dp[0][0]=0;
        dp[0][1]=-prices[0];
        for (int i = 1; i < prices.length; i++) {
            dp[i][0]=Math.max(dp[i-1][0],dp[i-1][2]);
            dp[i][1]=Math.max(dp[i-1][1],dp[i-1][0]-prices[i]);
            dp[i][2]=dp[i-1][1]+prices[i];
        }
        return Math.max(dp[prices.length-1][0],dp[prices.length-1][2]);
    }

    public static void main(String[] args) {
        int ss[] = {1,2,3,0,2};
        System.out.println(maxProfit(ss));

    }
}
