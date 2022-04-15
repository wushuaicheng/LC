package month_5;

import java.util.Stack;

public class LC12 {
    public static int evalRPN(String[] tokens) {
        Stack<Integer> num = new Stack<>();
        for (String token : tokens) {
            if(!isO(token)){
                num.add(Integer.parseInt(token));
            }else if(isO(token)){
                int num2 = num.pop();
                int num1 = num.pop();
                num.add(change(token,num1,num2));
            }
        }
        return num.pop();

    }
    public static boolean isO(String token){
        return ("+".equals(token) || "-".equals(token) || "*".equals(token) || "/".equals(token));

    }
    public static int change(String token,int num1 , int num2){
        if("+".equals(token)) return num1+num2;
        if("-".equals(token)) return num1-num2;
        if("*".equals(token)) return num1*num2;
        if("/".equals(token)) return num1/num2;
        return 0;
    }

    public static void main(String[] args) {
        String[] tokens = {"4","13","5","/","+"};
        System.out.println(evalRPN(tokens));
    }
}
