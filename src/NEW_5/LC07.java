package NEW_5;


import java.util.Arrays;
//746. 使用最小花费爬楼梯
//出界的路径数
public class LC07 {
    /*int[][][] cache;
    int MOD = (int)1e9+7;
    int m, n, max;
    int[][] dirs = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
    public int findPaths(int _m, int _n, int _max, int r, int c) {
        m=_m;
        n=_n;
        max=_max;
        cache = new int[_m][_n][_max+1];
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k <=max ; k++) {
                    cache[i][j][k]=-1;
                }
            }
        }
        return dfs(r,c,_max);
    }

    private  int dfs(int x, int y, int k) {
        if(x<0||x>=m||y<0||y>=n) return 1;
        if(k==0) return 0;
        if(cache[x][y][k]!=-1) return cache[x][y][k];
        int ans = 0;
        for (int[] d : dirs) {
            int nx = x + d[0], ny = y + d[1];
            ans += dfs(nx, ny, k - 1);
            ans %= MOD;
        }
        cache[x][y][k]=ans;
        return ans;
    }*/
    int[][] dirs = new int[][] {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    // 取余
    int MOD = 1000000007;

    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        int[][] dp = new int[m][n];
        int[][] tmp;
        for (int k = 1; k <= maxMove; k++) {
            tmp = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {

                    if (i == 0) tmp[i][j]++;
                    if (j == 0) tmp[i][j]++;
                    if (i == m - 1) tmp[i][j]++;
                    if (j == n - 1) tmp[i][j]++;

                    for (int[] dir : dirs) {
                        int nextI = i + dir[0];
                        int nextJ = j + dir[1];
                        if (nextI >= 0 && nextI < m && nextJ >= 0 && nextJ < n) {
                            tmp[i][j] = (tmp[i][j] + dp[nextI][nextJ]) % MOD;
                        }
                    }
                }
            }
            dp = tmp;
        }

        return dp[startRow][startColumn];
    }

    private int index(int i, int j, int n) {
        return i * n + j;
    }

    public int minCostClimbingStairs(int[] cost) {
        int aa = 0;
        int bb = 0;
        int cc;
        for (int i = 2; i <= cost.length ; i++) {
            cc=Math.min(aa+cost[i-1],bb+cost[i-2]);
            bb=aa;
            aa=cc;
        }
        return aa;
    }



}
