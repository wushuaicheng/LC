package month_5;

import java.util.Arrays;
import java.util.HashSet;

public class LC11 {
    public int missingNumber1(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length ; i++ ) {
            if(nums[i]!=i) return i;
        }
        return nums.length;
    }

    public int missingNumber2(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        for (int i = 0; i < nums.length; i++) {
            if(!set.contains(i)) return i;
        }
        return nums.length;
    }


    public int missingNumber(int[] nums) {
        int res = (0+nums.length)*(nums.length+1) / 2;
        for (int num : nums) {
            res-=num;
        }
        return res;

    }
}
