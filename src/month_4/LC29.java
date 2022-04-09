package month_4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LC29 {
    public static int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp,amount+1);
        dp[0] = 0;


        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (coins[j] <= i) {
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                }
            }
        }

        return (dp[amount]==amount+1)?-1:dp[amount];
    }

    public static void main(String[] args) {
        int[] ss = {4,3,2};
        System.out.println(coinChange(ss,5));

    }

}
