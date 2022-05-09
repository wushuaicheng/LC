package NEW_5;

import java.util.LinkedList;
import java.util.Queue;

public class LC09 {
    //542. 01 矩阵
    public int[][] updateMatrix1(int[][] mat) {
        int[][] dp = new int[mat.length][mat[0].length];
        for (int i = 0; i <mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                dp[i][j] = mat[i][j] == 0 ? 0 : 10000;
            }
        }

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (i - 1 >= 0) {
                    dp[i][j] = Math.min(dp[i][j], dp[i - 1][j] + 1);
                }
                if (j - 1 >= 0) {
                    dp[i][j] = Math.min(dp[i][j], dp[i][j - 1] + 1);
                }
            }
        }
        for (int i = mat.length-1; i >=0; i++) {
            for (int j = mat[0].length-1; j >=0; j++) {
                if (i + 1 < mat.length) {
                    dp[i][j] = Math.min(dp[i][j], dp[i+1][j] + 1);
                }
                if (j + 1 < mat[0].length) {
                    dp[i][j] = Math.min(dp[i][j], dp[i][j + 1] + 1);
                }
            }
        }
        return dp;

    }
    //542. 01 矩阵
    public int[][] updateMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(matrix[i][j]==0) queue.add(new int[] {i,j});
                else matrix[i][j]=-1;
            }
        }
        int[] dx = new int[] {-1, 1, 0, 0};
        int[] dy = new int[] {0, 0, -1, 1};
        while (!queue.isEmpty()) {
            int[] point = queue.poll();
            int x = point[0], y = point[1];
            for (int i = 0; i < 4; i++) {
                int newX = x + dx[i];
                int newY = y + dy[i];
                if (newX >= 0 && newX < m && newY >= 0 && newY < n
                        && matrix[newX][newY] == -1) {
                    matrix[newX][newY] = matrix[x][y] + 1;
                    queue.add(new int[] {newX, newY});
                }
            }
        }
        return matrix;
    }
    //518. 零钱兑换 II
    public int change1(int amount, int[] coins) {
        int[][] dp = new int[coins.length + 1][amount + 1];
        dp[0][0]=1;
        int val;
        for (int i = 1; i <=coins.length ; i++) {
            val=coins[i-1];
            for (int j = 0; j <= amount ; j++) {
                dp[i][j]=dp[i-1][j];
                for (int k = 1; k*val <=j ; k++) {
                    dp[i][j]+=dp[i-1][j-k*val];
                }
            }
        }
        return dp[coins.length][amount];
    }
    //518. 零钱兑换 II
    public int change(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        dp[0]=1;
        for (int coin : coins) {
            for (int i = coin; i <=amount ; i++) {
                dp[i]+=dp[i-coin];
            }
        }
        return dp[amount];
    }

}
