package month_5;

import java.util.Arrays;

//剑指 Offer 46. 把数字翻译成字符串
public class LC31 {
    public static int translateNum(int num) {
        char[] chars = String.valueOf(num).toCharArray();
        int[] dp = new int[chars.length+1];
        dp[0]=1;
        dp[1]=1;
        for (int i = 1; i < chars.length; i++) {
            if(chars[i-1]=='2'&&chars[i]<='5'||chars[i-1]=='1') dp[i+1]=dp[i]+dp[i-1];
            else dp[i+1]=dp[i];
        }
        return dp[chars.length];
    }

    public static void main(String[] args) {
        System.out.println(translateNum(18580));
    }
}
