package month_6;

import java.util.*;
//131. 分割回文串
public class LC15 {
    ArrayList<List<String>> res ;
    public List<List<String>> partition(String s) {
        res=new ArrayList<List<String>>();
        int len = s.length();
        if(len==0) return res;
        char[] ss = s.toCharArray();
        boolean[][] dp = new boolean[len][len];

        for (int right = 0; right < len; right++) {
            for (int left = 0; left <=right ; left++) {
                dp[left][right]=(ss[left]==ss[right]&&(right-left<3||dp[left+1][right-1]));
            }
        }
        ArrayDeque<String> temp = new ArrayDeque<>();
        dfs(s,0,len,dp,temp);

        return res;
    }

    private void dfs(String s, int index, int len, boolean[][] dp, Deque<String> path) {
        if(index==len){
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = index; i < len ; i++) {
            if(dp[index][i]){
                path.addLast(s.substring(index,i+1));
                //I+1 而不是index+1
                dfs(s, i+1, len, dp, path);
                path.removeLast();
            }
        }
    }


    public static void main(String[] args) {


    }


}
