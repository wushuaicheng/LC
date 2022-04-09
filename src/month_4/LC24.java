package month_4;
///剑指 Offer 19. 正则表达式匹配
public class LC24 {
//动态规划
    /*public boolean isMatch(String s, String p) {

        int n = s.length() + 1;
        int m = p.length() + 1;

        boolean[][] dp = new boolean[n][m];

        dp[0][0]=true;

        for (int i = 2; i < m; i+=2) {
            dp[0][i]=dp[0][i-2]&&p.charAt(i-1)=='*';
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m ; j++) {
                if(p.charAt(j-1)!='*'){
                    if((p.charAt(j-1)==s.charAt(i-1)||p.charAt(j-1)=='.')&&dp[i-1][j-1]) dp[i][j]=true;
                }else {
                    if(dp[i][j-2]) dp[i][j]=true;
                    else if(dp[i-1][j]&&(s.charAt(i-1)==p.charAt(j-2)||p.charAt(j-2)=='.')) dp[i][j]=true;
                }
            }

        }
        return dp[n-1][m-1];
    }*/
    //递归
    public boolean isMatch(String A, String B) {

        if(A.length()==0){
            if(B.length()%2!=0) return false;
            int i = 1 ;
            while (i<B.length()){
                if(B.charAt(i)!='*') return false;
                i+=2;
            }
            return true;
        }
        if(B.length()==0) return false;

        char a  = A.charAt(0);
        char b = B.charAt(0);
        char c = 'a';
        if(B.length()>1) c = B.charAt(1);
        if(c!='*'){
            if(a==b||b=='.') {
                return isMatch(A.substring(1),B.substring(1));
            } else {
                return false;
            }
        }else {
            if (a==b||b=='.'){
                return isMatch(A.substring(1),B)||isMatch(A,B.substring(2));
            }else {
                return isMatch(A,B.substring(2));
            }
        }
    }
}