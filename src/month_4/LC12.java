package month_4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class LC12 {
    //241. 为运算表达式设计优先级
    /*public List<Integer> diffWaysToCompute(String expression) {
        return divideAndConquer(expression.toCharArray());
    }

    public static List<Integer> divideAndConquer(char[] expression){
        List<Integer> res = new ArrayList<>();
        //处理一个数字的情况也就是分治划分到最底层的时候
        //isOneNum函数用来判断当前的表达式是否为一个单独的数字
        if (isOneNum(expression)){
            int num = 0;
            //将该数字从char数组转换为一个int型数值
            for (int i=0;i<expression.length;i++){
                num = num*10 +expression[i]-'0';
            }
            res.add(num);
            return res;
        }

        for (int i=0;i<expression.length;i++){
            if (!Character.isDigit(expression[i])){
                char[] left = new char[i];
                char[] right = new char[expression.length-i-1];
                //切分左右分治所使用的表达式数组
                System.arraycopy(expression,0,left,0,i);
                System.arraycopy(expression,i+1,right,0,expression.length-i-1);
                //对左边的表达式在进行一次同样的操作
                List<Integer> leftList = divideAndConquer(left);
                //对右边的表达式在进行一次同样的操作
                List<Integer> rightList = divideAndConquer(right);
                //计算左右两个表达式在当前用来切分的运算符进行运算后得到的所有可能的结果
                List<Integer> tempRes = calculate(leftList,rightList,expression[i]);
                //将这些结果加入最后的列表中作为这一层分治的最终结果
                for (Integer num:tempRes){
                    res.add(num);
                }
            }
        }
        return res;
    }
    //calculate函数用来对两个列表的数值逐个进行计算
    public static List<Integer> calculate(List<Integer> listOne,List<Integer> listTwo,char operator){
        List<Integer> res = new ArrayList<>();
        for (int i=0;i<listOne.size();i++){
            for (int j=0;j<listTwo.size();j++){
                res.add(calculateTwoNums(listOne.get(i),listTwo.get(j),operator));
            }
        }
        return res;
    }
    //简单的计算函数
    public static Integer calculateTwoNums(int num1,int num2,char operator){
        switch(operator) {
            case '+':
                return num1+num2;
            case '-':
                return num1-num2;
            default:
                return num1*num2;
        }
    }
    //判断是否当前表达式是否为一个数字
    public static boolean isOneNum(char[] expression){
        for (int i=0;i<expression.length;i++){
            if (!Character.isDigit(expression[i]))
                return false;
        }
        return true;
    }*/
   /* private static HashMap<String, List<Integer>> memory = new HashMap();
    private static  boolean isOp(char c){
        return c == '+' || c == '-' || c == '*';
    }
    public static List<Integer> diffWaysToCompute(String expression) {


        List<Integer> temp =  memory.get(expression);
        if(temp != null) return temp;

        List<Integer> ans = new LinkedList<Integer>();
        // 穷举所有的运算 可以用分治 太香了
        int sLen = expression.length();
        List<Integer> left = new LinkedList<Integer>();
        List<Integer> right = new LinkedList<Integer>();

        String leftString = new String();
        String rightString = new String();

        for(int i = 0 ; i < sLen ; ++i){
            if( isOp(expression.charAt(i)) ){
                leftString = expression.substring(0, i);
                rightString = expression.substring(i+1);
                left = diffWaysToCompute(leftString);
                right = diffWaysToCompute(rightString);
                memory.put(leftString, left);
                memory.put(rightString, right);
                for(Integer l : left){
                    for(Integer r : right){
                        switch(expression.charAt(i)){
                            case '+': ans.add(l + r); break;
                            case '-': ans.add(l - r); break;
                            case '*': ans.add(l * r); break;
                        }
                    }
                }
            }
        }
        if(ans.size() == 0) ans.add(Integer.valueOf(expression));
        return ans;
    }*/
    public static HashMap<String,List<Integer>> map = new HashMap<>();
    private static  boolean isOp(char c){
        return c == '+' || c == '-' || c == '*';
    }
    public static List<Integer> diffWaysToCompute(String expression) {
        List<Integer> integers = map.get(expression);
        if(integers!=null) return integers;
        List<Integer> ans = new LinkedList<>();
        List<Integer> left = new LinkedList<>();
        List<Integer> right = new LinkedList<>();
        int length = expression.length();
        String leftS = new String();
        String rightS = new String();

        for (int i = 0; i < length; i++) {
            if(isOp(expression.charAt(i))){
                leftS=expression.substring(0,i);
                rightS=expression.substring(i+1);
                left=diffWaysToCompute(leftS);
                right=diffWaysToCompute(rightS);
                map.put(rightS,right);
                map.put(leftS,left);
                for (Integer integer : left) {
                    for (Integer integer1 : right) {
                        switch(expression.charAt(i)){
                            case '+':ans.add(integer+integer1);break;
                            case '-':ans.add(integer-integer1);break;
                            case '*':ans.add(integer*integer1);break;
                        }
                    }
                }
            }

        }
        if(ans.size()==0) ans.add(Integer.valueOf(expression));
        return ans;
    }

    public static void main(String[] args) {
        diffWaysToCompute("2-1-1");
    }

}
