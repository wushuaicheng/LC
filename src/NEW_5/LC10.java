package NEW_5;

import java.util.Arrays;
import java.util.HashMap;

public class LC10 {


    public int coinChange1(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp,amount+1);
        dp[0]=0;
        for (int i = 1; i <= amount ; i++) {
            for (int coin : coins) {
                if(i>=coin) dp[i]=Math.min(dp[i],dp[i-coin]+1);
            }
        }
        return dp[amount]==amount+1?-1:dp[amount];
    }

    public int coinChange2(int[] coins, int amount) {
        if(amount<1) return 0;
        return dfs(amount,coins,new int[amount]);
    }

    private int dfs(int amount, int[] coins , int[] count) {
        if(amount<0) return -1;
        if(amount==0) return 0;
        if(count[amount-1]!=0) return count[amount-1];
        int min = Integer.MAX_VALUE;
        for (int coin : coins) {
            int x = dfs(amount-coin,coins,count);
            if(x>=0&&x<min) min = x+1;
        }
        count[amount-1]=min==Integer.MAX_VALUE?-1:min;
        return count[amount-1];
    }


    //560. 和为 K 的子数组
    public int subarraySum(int[] nums, int k) {
       int pre = 0;
       int res = 0;

       HashMap<Integer, Integer> map = new HashMap<>();
       map.put(0,1);
        for (int num : nums) {
            pre+=num;
            if(map.containsKey(pre-k)) res+=map.get(pre-k);
            map.put(pre,map.getOrDefault(pre,0)+1);
        }
        return res;
    }


    //724 找中心
    public static int pivotIndex(int[] nums) {
        int[] pre = new int[nums.length+1];
        pre[0]=0;
        for (int i = 1; i <= nums.length ; i++) {
            pre[i]=pre[i-1]+nums[i-1];
        }
        for (int i = 0; i < nums.length ; i++) {
            if(pre[i]==pre[nums.length]-pre[i+1]) return i;
        }
        return -1;
    }


    public static void main(String[] args) {
        System.out.println(pivotIndex(new int[] {2,1,-1}));
        System.out.println(222);
    }
}
