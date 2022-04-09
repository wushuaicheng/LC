package month_3;

public class LC17 {
    //494. 目标和
    //回溯
    /*int count = 0 ;
    public int findTargetSumWays(int[] nums, int target) {
        backtrack(nums, target, 0, 0);
        return count;
    }

    private void backtrack(int[] nums, int target, int sum, int index) {
        if(index==nums.length){
            if(sum==target){
                count++;
                return;
            }
        }else {
            backtrack(nums, target, sum + nums[index], index+1);
            backtrack(nums, target, sum - nums[index], index+1);
        }
    }*/
    //动态规划
    /*public int findTargetSumWays(int[] nums, int target) {
        int sum=0;
        for (int num : nums) {
            sum+=Math.abs(num);
        }
        if (Math.abs(target) > sum) return 0;
        int[][] dp = new int[nums.length+1][2*sum+1];
        dp[0][sum]= 1;
        for(int i = 1  ;i <=nums.length ; i++){
            int x = nums[i-1];
            for(int j = -sum ; j <= sum ; j++){
               if(j+sum+x<=2*sum)dp[i][j+sum]+=dp[i-1][j+sum+x];
               if(j+sum-x>=0)dp[i][j+sum]+=dp[i-1][j+sum-x];

            }

        }
        return dp[nums.length][target+sum];

    }*/

      /*public int findTargetSumWays(int[] nums, int t) {
        int n = nums.length;
        int s = 0;
        for (int i : nums) s += Math.abs(i);
        if (t > s || (s - t) % 2 != 0) return 0;
        int m = (s - t) / 2;
        int[][] f = new int[n + 1][m + 1];
        f[0][0] = 1;
        for (int i = 1; i <= n; i++) {
            int x = nums[i - 1];
            for (int j = 0; j <= m; j++) {
                f[i][j] += f[i - 1][j];
                if (j >= x) f[i][j] += f[i - 1][j - x];
            }
        }
        return f[n][m];
    }*/
    //递归优化
      public int findTargetSumWays(int[] nums, int target) {
          int sum=0;
          for (int num : nums) {
              sum+=Math.abs(num);
          }
          int x = (sum-target)/2;
          if (sum<target|| (sum - target) % 2 != 0) return 0;
          int[][] dp = new int[nums.length+1][x+1];
          dp[0][0]=1;
          for(int i = 1 ; i <=nums.length ; i++){
              for(int j = 0 ; j <= x ;j++){
                  dp[i][j]+=dp[i-1][j];
                  if(j>=nums[i-1]) dp[i][j]+=dp[i-1][j-nums[i-1]];
              }
          }
          return dp[nums.length][x];
      }

}
