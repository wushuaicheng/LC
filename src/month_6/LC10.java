package month_6;

//120. 三角形最小路径和

import java.util.ArrayList;
import java.util.List;

public class LC10 {
    public static int minimumTotal(List<List<Integer>> triangle) {
        int length = triangle.size();
        int[][] dp = new int[length][length];
        dp[0][0]=triangle.get(0).get(0);
        for (int j = 1; j < length; j++) dp[j][0]= dp[j-1][0]+triangle.get(j).get(0);
        for (int j = 1; j < length; j++) dp[j][j]= dp[j-1][j-1]+triangle.get(j).get(j);
        for (int i = 1; i < length; i++) {
            for (int j = 1; j < i ; j++) {
                dp[i][j]=Math.min(dp[i-1][j-1],dp[i-1][j])+triangle.get(i).get(j);
            }
        }
        int res = Integer.MAX_VALUE;
        for (int i : dp[length - 1]) {
            if(i<res) res = i;
        }
        return res;
    }

    public static void main(String[] args) {
        ArrayList<Integer> t1 = new ArrayList<>();
        t1.add(2);
        ArrayList<Integer> t2 = new ArrayList<>();
        t2.add(3);
        t2.add(4);
        ArrayList<Integer> t3 = new ArrayList<>();
        t3.add(6);
        t3.add(5);
        t3.add(7);
        ArrayList<Integer> t4 = new ArrayList<>();
        t4.add(4);
        t4.add(1);
        t4.add(8);
        t4.add(3);
        ArrayList<List<Integer>> lists = new ArrayList<>();
        lists.add(t1);
        lists.add(t2);
        lists.add(t3);
        lists.add(t4);
        int i = minimumTotal(lists);
        System.out.println(i);


    }
}
