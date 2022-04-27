package month_6;

import java.util.List;

//139. 单词拆分
public class LC12 {
    public boolean wordBreak(String s, List<String> wordDict) {

        int length = s.length();
        boolean[] dp = new boolean[length+1];
        dp[0]=true;
        for (int i = 1; i <= length ; i++) {
            for (int j = 0; j < i; j++) {
                if(dp[j]&&check(s.substring(j,i),wordDict)){
                    dp[i]=true;
                    continue;
                }
            }

        }
        return dp[length];
    }
    public Boolean check(String s , List<String> wordDict){
        return wordDict.contains(s);
    }

}
