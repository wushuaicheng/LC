package month_5;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class LC13 {
    public static int calculate(String s) {
        //存放数字和符号的stack
        Stack<Integer> num = new Stack<>();
        Stack<Character> opo = new Stack<>();
        char[] chars = s.toCharArray();
        int temp = 0;
        for (int i = 0; i < chars.length; i++) {
            //如果是数字，空格则跳过。
            if (!isO(chars[i])) {
                if(chars[i]==' ') continue;
                //判断多位数字的方法
                temp = Integer.valueOf(chars[i]-48);
                while (i+1<chars.length&&!isO(chars[i+1])&&chars[i+1]!=' ') {
                    temp = temp*10+Integer.valueOf(chars[i+1]-48);
                    i++;
                }
                num.add(temp);
                //是运算符号，如果他不是空，并且他的符号优先级小于等于栈顶元素的优先级则进入循环，计算结果。
            }else if(isO(chars[i])){
                while (!opo.isEmpty() && level(opo.peek())>=level(chars[i])){
                    Integer num2 = num.pop();
                    Integer num1 = num.pop();
                    num.add(calculating(opo.pop(),num1,num2));
                }
                //栈空，或者大于后将其填入
                    opo.add(chars[i]);
            }
        }
        //全部放入后进行计算，得到结果。
        while (!opo.isEmpty()){
            Integer num2 = num.pop();
            Integer num1 = num.pop();
            num.add(calculating(opo.pop(),num1,num2));
        }
        return num.pop();
    }


    //运算符的判断
    public static boolean isO(char token){
        return ('+'==token || '-'==token || '*'== token || '/' == token);
    }
    //优先级
    public static int level(char token){
        if(token=='-') return 1;
        if(token=='+') return 1;
        if(token=='*'||token=='/') return 2;
        return 0;
    }

    //计算方法
    public static int calculating(char token, int num1, int num2) {
        if ('+' == token) return num1 + num2;
        if ('-' == token) return num1 - num2;
        if ('*' == token) return num1 * num2;
        if ('/' == token) return num1 / num2;
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(calculate("14-3/2"));
    }
}
