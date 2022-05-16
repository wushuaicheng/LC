package NEW_5;

import java.nio.file.ClosedWatchServiceException;
import java.util.HashMap;
import java.util.Map;

public class LC13 {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        int temp = 0;
        for (int i = 0; i < nums.length ; i++) {
            temp=(temp+nums[i])%k;
            if(map.containsKey(temp)){
                if(i-map.get(temp)>=2) return true;
            }
            else map.put(temp,i);
        }

        return false;

    }

    public int longestOnes1(int[] nums, int k) {
        int[] pre = new int[nums.length + 1];
        for (int i = 1; i <= nums.length ; i++) {
            pre[i]=pre[i-1]+(1-nums[i-1]);
        }
        int ans = 0;
        for (int right = 0; right < nums.length; ++right) {
            int left = binarySearch(pre, pre[right + 1] - k);
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }

    public int binarySearch(int[] pre, int target) {
        int low = 0, high = pre.length - 1;
        while (low < high) {
            int mid = (high - low) / 2 + low;
            if (pre[mid] < target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

    public int longestOnes(int[] nums, int k) {
        int res = 0;
        int l = 0;
        int lsum = 0;
        int rsum = 0;
        for (int r = 0; r < nums.length ; r++) {
            rsum+=1-nums[r];
            while (rsum-lsum>k){
                l++;
                lsum+=1-nums[l];
            }
            res=Math.max(res,r-l+1);
        }
        return res;
    }






}
