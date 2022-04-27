package month_6;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

//121. 买卖股票的最佳时机
public  class LC14 {
    public int maxProfit(int[] prices) {
        int[][] dp = new int[2][prices.length];
        if(prices.length<2) return 0;
        dp[0][0]=0;
        dp[1][0]=-prices[0];
        for (int i = 1; i < prices.length; i++) {
            dp[0][i]=Math.max(dp[0][i-1],dp[1][i-1]+prices[i]);
            dp[1][i]=Math.max(dp[1][i-1],-prices[i]);
        }

        return dp[0][prices.length-1];
    }

    public static void main(String[] args) {
        int ss[]={7,1,5,3,6,4};
    }
}
