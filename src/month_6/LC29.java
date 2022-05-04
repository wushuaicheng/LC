package month_6;
//392. 判断子序列
public class LC29 {
    public boolean isSubsequence1(String s, String t) {
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();
        int[][] dp = new int[s.length()+1][t.length()+1];

        for (int i = 1; i <= ss.length; i++) {
            for (int j = 1; j <= tt.length; j++) {
                if(ss[i-1]==tt[j-1]) dp[i][j]=dp[i-1][j-1]+1;
                else dp[i][j]=dp[i][j-1];
            }
        }
        if(dp[s.length()][t.length()]==s.length()) return true;
        else return false;

    }
    public boolean isSubsequence(String s, String t) {
        int n = s.length(), m = t.length();
        if(n==0) return true;
        int x = 0;
        for (int i = 0; i < m; i++) {
            if (s.charAt(x) == t.charAt(i)) {
                x++;
                if (x==n+1) return true;
            }
        }
        return false;
    }
}
