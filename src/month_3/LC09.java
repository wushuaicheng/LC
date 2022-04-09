package month_3;

import javax.print.DocFlavor;
import java.util.Arrays;

public class LC09 {
    /*public  static  int maxScore(String s) {
        int num1 = 0;
        int num0 = 0;
        int max = 0 ;

        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i)=='1') num1++;
        }
        System.out.println("9999      "+num1);

        for(int i = 0 ; i < s.length()-1 ; i++){
            if(s.charAt(i)=='0'){
                num0++;
            }else {
                num1--;
            }
            max=Math.max(max,num1+num0);

        }
        return max;

    }

    public static void main(String[] args) {
        int i = maxScore("00111");
        System.out.println(i);
    }*/
    /*public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        int length = s.length();
        int left = 0;
        int right = 0;
        int len = 1;
        int maxStart = 0;
        int maxLen = 0;
        for(int i = 0 ; i < length ; i++){
            left=i-1;
            right=i+1;
            while(left>=0&&s.charAt(left)==s.charAt(i)) {
                len++;
                left--;
            }
            while(right<length&&s.charAt(i)==s.charAt(left)){
                len++;
                right++;
            }
            while(left>=0&&right<length&&s.charAt(right)==s.charAt(left)){
                len=len+2;
                left--;
                right++;
            }
            if(len>maxLen){
                maxLen=len;
                maxStart=left;
            }
            len=1;
        }
        return s.substring(maxStart+1,maxStart+maxLen+1);

    }*/
   /* public String longestPalindrome(String s) {
        int length = s.length();
        if (length < 2) {
            return s;
        }
        char[] chars = s.toCharArray();
        int maxLen = 1 , begin =0;
        boolean dp[][]=new boolean[length][length];
        for(int i = 0; i<length ; i++){
            dp[i][i]=true;
        }
        for(int R = 1 ; R<length ; R++){
            for(int L =0 ; L<R ; L++){
                if(chars[L]!=chars[R]){
                    dp[L][R]=false;
                }else{
                    if(R-L<3){
                        dp[L][R]=true;
                    }else{
                        dp[L][R]=dp[L+1][R-1];
                    }
                }
                if (dp[L][R] && R-L + 1 > maxLen) {
                    maxLen = R - L + 1;
                    begin = L;
                }
            }
        }
        return s.substring(begin,begin+maxLen);
    }*/
    public String longestPalindrome(String s) {
        char[] chars = s.toCharArray();
        int length = s.length();
        int begin = 0 , maxLen = 1 ;
        boolean dp[][] = new boolean[length][length];
        for(int i = 0 ; i < length ; i++){
            dp[i][i]=true;
        }
        for(int R = 1 ; R < length ; R++){
            for(int L = 0 ; L < R ; L++){
                if(chars[L]!=chars[R]){
                    dp[L][R]=false;
                }else{
                    if(R-L<3){
                        dp[L][R]=true;
                    }else {
                        dp[L][R]=dp[L+1][R-1];
                    }
                }
                if(dp[L][R]&&R-L+1>maxLen){
                    maxLen=R-L+1;
                    begin=L;
                }
            }
        }
        return s.substring(begin,begin+maxLen);
    }

}
