package month_2;

import java.util.ArrayList;
import java.util.List;

public class LC220218 {
    public List<String> generateParenthesis(int n){
        List<String> res = new ArrayList<>();
        if(n==0){
            return res;
        }
        dfs("",n,n,res);
        return res;
    }
    public void dfs(String curStr,int left,int right,List<String> res){

        if(left==0&&right==0){
            res.add(curStr);
            return;
        }
        if(left>right)
            return;
        if(left>0){
            dfs( curStr+"(", left-1, right, res);
        }
        if(right>0){
            dfs( curStr+")", left, right-1, res);
        }
    }

    public static void main(String[] args) {

        int a = 6;
        String b="3";
       // b.equals()
    }
}
/*public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        if (n == 0) {
            return res;
        }

        dfs("", n, n, res);
        return res;
    }

    private void dfs(String curStr, int left, int right, List<String> res) {

        if (left == 0 && right == 0) {
            res.add(curStr);
            return;
        }
        if (left > right) {
            return;
        }
        if (left > 0) {
            dfs(curStr + "(", left - 1, right, res);
        }

        if (right > 0) {
            dfs(curStr + ")", left, right - 1, res);
        }
    }
}*/