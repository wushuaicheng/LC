package month_5;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

//219. 存在重复元素 II
public class LC07 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])&&(Math.abs(i-map.get(nums[i]))<=k)) return true;
            map.put(nums[i],i);
        }
        return false;
    }


    public boolean containsNearbyDuplicate1(int[] nums, int k) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if (i > k) set.remove(nums[i - k - 1]);
            if (set.contains(nums[i])) return true;
            set.add(nums[i]);
        }
        return false;
    }
}
