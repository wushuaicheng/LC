package month_6;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class LC09 {
    //97. 交错字符串
    public boolean isInterleave(String s1, String s2, String s3) {
        boolean[][] dp = new boolean[s1.length() + 1][s2.length() + 1];
        if(s1.length()+s2.length()!=s3.length()) return false;
        dp[0][0]=true;
        for (int i = 1; i <=s1.length()&&s1.charAt(i-1)==s3.charAt(i-1) ; i++) dp[i][0]=true;
        for (int i = 1; i <=s2.length()&&s2.charAt(i-1)==s3.charAt(i-1) ; i++) dp[0][i]=true;

        for (int i = 1; i <=s1.length() ; i++) {
            for (int j = 1; j <= s2.length() ; j++) {
                dp[i][j]=(dp[i-1][j]&&s1.charAt(i-1)==s3.charAt(i+j-1))||(dp[i][j-1]&&s2.charAt(j-1)==s3.charAt(i+j-1));
            }
        }
        return dp[s1.length()][s2.length()];
    }
}
