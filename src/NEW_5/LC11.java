package NEW_5;

import com.sun.xml.internal.bind.v2.model.core.EnumLeafInfo;

import java.util.Arrays;
import java.util.HashMap;

public class LC11 {
    //209. 长度最小的子数组
    public static int minSubArrayLen(int target, int[] nums) {
        int[] pre = new int[nums.length + 1];
        for (int i = 1; i <= nums.length ; i++) {
            pre[i]+=pre[i-1]+nums[i-1];
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= nums.length ; i++) {
            for (int j = i+1; j <= nums.length ; j++) {
                if(pre[j]-pre[i]>=target&&j-i<min){
                    min = j-i;
                }
            }
        }
        return min==Integer.MAX_VALUE?0:min;
    }
    //209. 长度最小的子数组
    public static int minSubArrayLen1(int target, int[] nums) {
        int[] sum = new int[nums.length + 1];
        for (int i = 1; i <= nums.length ; i++) {
            sum[i]+=sum[i-1]+nums[i-1];
        }
        int t= 0;
        int bound;
        int min = Integer.MAX_VALUE;
        for (int i = 1; i <= nums.length ; i++) {
            t = sum[i-1]+target;
            bound = Arrays.binarySearch(sum, t);
            if(bound<0) bound = -bound-1;
            if(bound<=nums.length) min = Math.min(min,bound-(i-1));
        }
        return min == Integer.MAX_VALUE ? 0 : min;

    }
    //209. 长度最小的子数组
    public int minSubArrayLen2(int target, int[] nums) {
        int min = Integer.MAX_VALUE;
        int left = 0;
        int right = 0;
        int sum = 0;
        while (right<nums.length){
            sum+=nums[right];
            while (sum>=target){
                min = Math.min(min,right-left+1);
                sum-=nums[left];
                left++;
            }
            right++;
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }
    //930. 和相同的二元子数组
    public int numSubarraysWithSum1(int[] nums, int goal) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int res = 0;
        for (int i = 0; i < nums.length ; i++) {
            map.put(sum,map.getOrDefault(sum,0)+1);
            sum+=nums[i];
            res+=map.getOrDefault(sum-goal,0);
        }
        return res;
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
        int res = 0;
        int left1 = 0;
        int left2 = 0;
        int right = 0;
        int sum1= 0;
        int sum2 = 0;
        while (right<nums.length){
            sum1+=nums[right];
            while (left1<=right&&sum1>goal){
                sum1-=nums[left1];
                left1++;
            }
            sum2+=nums[right];
            while (left2 <= right && sum2 >= goal) {
                sum2 -= nums[left2];
                left2++;
            }
            res+=left2-left1;
            right++;
        }
        return res;
    }


}
