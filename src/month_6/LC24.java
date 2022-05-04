package month_6;

import javax.security.auth.login.CredentialNotFoundException;
import java.util.Arrays;

//213. 打家劫舍 II
public class LC24 {
    public static int rob(int[] nums) {
        if(nums.length<2) return nums[0];
        if(nums.length==2) return Math.max(nums[1],nums[0]);
        int[] dp = new int[nums.length-1];
        dp[0]=nums[0];
        dp[1]=nums[1];
        for (int i = 2; i < nums.length-1 ; i++) {
            dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i]);
        }
        int res = dp[nums.length-2];
        Arrays.fill(dp,0);
        dp[0]=nums[1];
        dp[1]=Math.max(nums[1],nums[2]);
        for (int i = 2; i < nums.length-1 ; i++) {
            dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i+1]);
        }
        return Math.max(res,dp[nums.length-2]);
    }

    public static void main(String[] args) {
        int[] ss= {1,3,1,3,100};
        System.out.println(rob(ss));
    }
}
