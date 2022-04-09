package month_2;

import java.util.Stack;

public class LC220221 {
    /*
    * public int longestValidParentheses(String s) {
        int max = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.empty()) {
                    stack.push(i);
                } else {
                    max = Math.max(max, i - stack.peek());
                }
            }
        }
        return max;
    }*/
/*    public int longestValidParentheses(String s){
        int max = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        for(int i = 0 ; i<s.length() ; i++){
            if(s.charAt(i)=='('){
                stack.push(i);
            }else {
                stack.pop();
                if(stack.isEmpty()){
                    stack.push(i);
                }else {
                    max = Math.max(max,i-stack.peek());
                }
            }
        }
        return max;

    }*/
    /*
    * class Solution {
    public int longestValidParentheses(String s) {
        if (s == null || s.length() == 0) return 0;
        int[] dp = new int[s.length()];
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i > 0 && s.charAt(i) == ')') {
                if (s.charAt(i - 1) == '(') {
                    dp[i] = (i - 2 >= 0 ? dp[i - 2] + 2 : 2);
                } else if (s.charAt(i - 1) == ')' && i - dp[i - 1] - 1 >= 0 && s.charAt(i - dp[i - 1] - 1) == '(') {
                    dp[i] = dp[i - 1] + 2 + (i - dp[i - 1] - 2 >= 0 ? dp[i - dp[i - 1] - 2] : 0);
                }
            }
            res = Math.max(res, dp[i]);
        }
        return res;
    }
}
  */

 public int longestValidParentheses(String s) {
     if(s==null||s.length()==0)return 0;
     int[] dp = new int[s.length()];
     int res = 0;
     for(int i = 0 ; i< s.length() ; i++){
         if(s.charAt(i)==')'){
             if(s.charAt(i-1)=='('){
                 dp[i]=(i-2>=0?dp[i-2]+2:2);

             }else if(s.charAt(i-1)==')'&& i-dp[i-1]-1>=0&&s.charAt(i-dp[i-1]-1)=='('){
                 dp[i]=dp[i-1]+2+(i-dp[i-1]-2>=0?dp[i-dp[i-1]-2]:0);
             }
         }
         res=Math.max(res,dp[i]);
     }
     return res;
 }
}

