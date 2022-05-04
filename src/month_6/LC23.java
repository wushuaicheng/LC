package month_6;
//198. 打家劫舍
public class LC23 {
    public static int rob1(int[] nums) {
        if(nums.length<2) return nums[0];
        int[][] dp = new int[nums.length][2];
        dp[0][0]=0;
        dp[0][1]=nums[0];
        for (int i = 1; i <nums.length ; i++) {
            dp[i][0]=Math.max(dp[i-1][0],dp[i-1][1]);
            dp[i][1]=dp[i-1][0]+nums[i];
        }
        return Math.max(dp[nums.length-1][0],dp[nums.length-1][1]);
    }
    public static int rob(int[] nums) {
        if(nums.length<2) return nums[0];
        int[] dp = new int[nums.length];
        dp[0]=nums[0];
        dp[1]=nums[1];
        for (int i = 2; i < nums.length ; i++) {
            dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i]);
        }
        return dp[nums.length-1];
    }


    public static void main(String[] args) {
        int[] ss= {1,3,1};
        System.out.println(rob(ss));

    }
}
