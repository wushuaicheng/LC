package NEW_5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

//313. 超级丑数
//553. 最优除法
public class LC06 {
    /*HashMap<Integer,Integer> map = new HashMap<>();
    public int numTrees(int n) {
        if(map.containsKey(n)) return map.get(n);
        if(n==1||n==0) return 1;
        int left = 0;
        int right = 0;
        int res = 0;
        for (int i = 1; i <= n; i++) {
            left=numTrees(i-1);
            right=numTrees(n-i);
            res+=left*right;
        }
        map.put(n,res);
        return res;
    }*/

    public int nthSuperUglyNumber(int n, int[] primes) {
        //记录每个因数乘到第几项
        int[] time = new int[primes.length];
        int[] dp = new int[n];
        dp[0] = 1;
        int temp = Integer.MAX_VALUE;
        //定义临时变量
        int tt = 0;
        int index = 0;

        for (int i = 1; i < n; i++) {
            temp = Integer.MAX_VALUE;
            for (int j = 0; j < primes.length; j++) {
                //寻找这一轮里面的最小值
                tt = primes[j] * dp[time[j]];
                if (tt < temp) {
                    temp = tt;
                    index = j;
                }
            }
            for (int j = 0; j < primes.length; j++) {
                //存在重复情况 去重
                if (primes[j] * dp[time[j]] == temp) time[j]++;
            }
            dp[i] = temp;
        }
        if (temp == Integer.MAX_VALUE) return 1;
        return temp;
    }
    /*public static int nthSuperUglyNumber(int n, int[] primes) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        q.add(1);
        while (n-- > 0) {
            int x = q.poll();
            if (n == 0) return x;
            for (int k : primes) {
                if (k <= Integer.MAX_VALUE / x) q.add(k * x);
                if (x % k == 0) break;
            }
        }
        return -1; // never
    }*/
    public String optimalDivision(int[] nums) {
        int length = nums.length;
        if(length==1) return String.valueOf(nums[0]);
        if(length==2) return nums[0]+"/"+nums[1];
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 1; i < length-1; i++) {
            stringBuffer.append(nums[i]);
            stringBuffer.append("/");
        }
        return nums[0]+"/("+stringBuffer+nums[length-1]+")";
     }


}
