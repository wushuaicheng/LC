package month_4;

import org.w3c.dom.ls.LSOutput;

//斐波那契数 （通常用 F(n) 表示）形成的序列称为 斐波那契数列
public class LC16 {
    public static int fib1(int n) {

        if(n==0) return 0;
        if(n==1) return 1;
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n ; i++) {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    int fib(int N) {
        if(N<1) return  0;
        if (N == 1 || N == 2) return 1;
        return fib(N - 1) + fib(N - 2);
    }



}
