package month_5;

import java.util.ArrayList;
import java.util.List;

//51. N 皇后
public class LC23 {
    /*List<List<String>> list = new ArrayList<>();
    public  List<List<String>> solveNQueens(int n) {
        int[] ints = new int[n];
        dfs(n,ints,0);
        return list;
    }

    private  void dfs(int n, int[] ints, int i) {
        if(i==n) {
            ArrayList<String> temp = new ArrayList<>();
            for (int anInt : ints) {
                StringBuffer stringBuffer = new StringBuffer();
                for (int i1 = 0; i1 < anInt; i1++) {
                    stringBuffer.append(".");
                }
                stringBuffer.append("Q");
                for (int i1 = anInt+1; i1 < 8; i1++) {
                    stringBuffer.append(".");
                }
                temp.add(stringBuffer.toString());
            }
            list.add(temp);
            return;
        }
        for (int j = 0; j < n; j++) {
            ints[i]=j;
            if(check(ints,i)) dfs(n,ints,i+1);
        }

    }*/
    List<List<String>> list = new ArrayList<>();
    public  List<List<String>> solveNQueens(int n) {
        //核心思想就是用一维数组代替二维数组
        //如ints[4]=3 表示的是第5个皇后放在第5行第4个位置上
        //用数组表示列也是一个原理
        int[] ints = new int[n];
        dfs(n,ints,0);
        return list;
    }

    private  void dfs(int n, int[] ints, int i) {
        //递归出口
        if(i==n) {
            ArrayList<String> temp = new ArrayList<>();
            //先对每个元素进行遍历，如5 应返回的时...Q....
            for (int anInt : ints) {
                StringBuffer stringBuffer = new StringBuffer();
                for (int i1 = 0; i1 < anInt; i1++) {
                    stringBuffer.append(".");
                }
                stringBuffer.append("Q");
                for (int i1 = anInt+1; i1 < 8; i1++) {
                    stringBuffer.append(".");
                }
                temp.add(stringBuffer.toString());
            }
            list.add(temp);
            return;
        }
        for (int j = 0; j < n; j++) {
            ints[i]=j;
            if(check(ints,i)) dfs(n,ints,i+1);
        }

    }
    private  boolean check(int[] ints, int i) {
        for (int j = 0; j < i; j++) {
            //检查放置之前的元素又没用同列，同线的（同行不用判断 一维数组特性）
            if(ints[j]==ints[i]||Math.abs(i-j)==Math.abs(ints[i]-ints[j])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
    }
}
