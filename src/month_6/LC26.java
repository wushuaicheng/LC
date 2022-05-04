package month_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC26 {
    /*public int numSquares(int n) {
        int[] dp = new int[n + 1];
        for (int i = 1; i <= n ; i++) {
            dp[i]=i;
            for (int j = 1; i-j*j>=0 ; j++) {
                dp[i]=Math.min(dp[i],dp[i-j*j]+1);
            }
        }
        return dp[n];

    }*/

    public int numSquares(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i*i <= n  ; i++) list.add(i*i);
        int[][] dp = new int[list.size() + 1][n + 1];
        Arrays.fill(dp[0],Integer.MAX_VALUE);
        dp[0][0]=0;
        for (int i = 1; i <= list.size() ; i++) {
            int x = list.get(i-1);
            for (int j = 0; j <= n  ; j++) {
                dp[i][j]=dp[i-1][j];
                for (int k = 1; k*x <=j ; k++) {
                    if(dp[i-1][j-k*x]!=Integer.MAX_VALUE) dp[i][j]=Math.min(dp[i][j],dp[i-1][j-k*x]+k);
                }
            }
        }
        return dp[list.size()][n];
    }
}
