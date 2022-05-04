package month_6;

import java.util.Arrays;

//221. 最大正方形
public class LC25 {
    public static int maximalSquare1(char[][] matrix) {
        int max = 0;
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return max;
        int[][] dp = new int[matrix.length+1][matrix[0].length+1];
        /*for (int i = 0; i < matrix.length; i++) {
            dp[i][0]=(matrix[i][0]==1?1:0);
        }
        for (int i = 0; i < matrix[0].length; i++) {
            dp[0][i]=(matrix[0][i]==1?1:0);
        }*/

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j]=='1') dp[i+1][j+1]=Math.min(dp[i][j+1],Math.min(dp[i][j],dp[i+1][j]))+1;
                max = Math.max(max, dp[i + 1][j + 1]);
            }
        }
        for (int[] ints : dp) {
            System.out.println(Arrays.toString(ints));
            System.out.println("==");
        }
        return max*max;
    }

    public static int maximalSquare(char[][] matrix) {
        int max = 0;
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return max;
        int[][] dp = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            dp[i][0]=(matrix[i][0]=='1'?1:0);
            max = Math.max(max, dp[i][0]);
        }
        for (int i = 0; i < matrix[0].length; i++) {
            dp[0][i]=(matrix[0][i]=='1'?1:0);
            max = Math.max(max, dp[0][i]);
        }
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if(matrix[i][j]=='1') dp[i][j]=Math.min(dp[i-1][j],Math.min(dp[i-1][j-1],dp[i][j-1]))+1;
                max = Math.max(max, dp[i][j]);
            }
        }
        return max*max;
    }

    public static void main(String[] args) {

        char[][] ss = {{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};
        maximalSquare1(ss);
    }
}
