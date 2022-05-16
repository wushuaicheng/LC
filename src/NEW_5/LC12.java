package NEW_5;

import java.util.HashMap;
import java.util.Map;

public class LC12 {
    //525. 连续数组
    public int findMaxLength(int[] nums) {
        int res = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        int cur = 0;
        int num = 0;
        for (int i = 0; i < nums.length ; i++) {
            num=nums[i]==1?1:-1;
            cur+=num;
            if(map.containsKey(cur)) res = Math.max(res,i-map.get(cur));
            else map.put(cur,i);
        }
        return res;
    }
    //238. 除自身以外数组的乘积
    public int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int[] res = new int[nums.length];
        left[0]=nums[0];
        for (int i = 1; i < nums.length ; i++) {
            left[i]=left[i-1]*nums[i];
        }
        right[nums.length-1]=nums[nums.length-1];
        for (int i = nums.length-2; i >=0 ; i--) {
            right[i]=right[i+1]*nums[i];
        }
        res[0]=right[1];
        res[nums.length-1]=left[nums.length-2];
        for (int i = 1; i < nums.length-1; i++) {
            res[i]=left[i-1]*right[i+1];
        }
        return res;

    }


}
