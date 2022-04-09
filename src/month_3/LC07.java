package month_3;

import java.util.HashMap;
import java.util.TreeSet;

public class LC07 {
    long size = 0;
    public boolean containsNearbyAlmostDuplicate1(int[] nums, int k, int t) {
        int length = nums.length;
        TreeSet<Long> longs = new TreeSet<>();
        for(int i = 0 ; i<length ;i++) {
            long num = nums[i];
            Long l = longs.floor(num);
            Long r = longs.ceiling(num);
            if(l!=null&&num-l<=t) return  true;
            if(r!=null&&r-num<=t) return true;
            longs.add(num);
            if(i>=k) longs.remove(nums[i-k]*1l);
        }
        return false;
    }
    /*public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        HashMap<Long, Long> hashMap = new HashMap<>();
        int n = nums.length;
        size = t+1l;
        for(int i = 0 ;i<n;i++){
            long num = nums[i]*1l;
            long index = getIdx(num);
            if(hashMap.containsKey(index)) return true;
            long l = index-1;
            long r = index+1;
            if(hashMap.containsKey(l)&&num-hashMap.get(l)<=t) return true;
            if(hashMap.containsKey(r)&&hashMap.get(r)-num<=t) return true;
            hashMap.put(index,num);
            if(i>=k) hashMap.remove(getIdx(nums[i-k])*1l);
        }
        return false;
    }

    long getIdx(long u) {
        return u >= 0 ? u / size : ((u + 1) / size) - 1;
    }*/
    /*public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        HashMap<Long, Long> hashMap = new HashMap<>();
        int length = nums.length;
        size = t+1l;
        for(int i = 0 ; i < length ; i++){
            long num = nums[i];
            long index =getIdx(num);

            if(hashMap.containsKey(index)) return  true;
            long l = index-1;
            long r = index+1;
            if(hashMap.containsKey(l)&&num-hashMap.get(l)<=t) return true;
            if(hashMap.containsKey(r)&&hashMap.get(r)-num<=t) return true;
            hashMap.put(index,num);
            if(i>=k) hashMap.remove(getIdx(nums[i-k]));
        }
        return false;

    }

    long getIdx(long num) {
        return num>=0?num/size:((num+1)/size)-1;

    }*/

    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        HashMap<Long, Long> hashMap = new HashMap<>();
        int length = nums.length;
        size = t + 1;
        for (int i = 0; i < length; i++) {
            long num = nums[i];

            long index = getIdx(num);

            long r = index + 1;
            long l = index - 1;

            if (hashMap.containsKey(num)) return true;
            if (hashMap.containsKey(l) && num - hashMap.get(l) <= t) return true;
            if (hashMap.containsKey(r) && hashMap.get(r) - num <= t) return true;

            hashMap.put(index, num);
            if (i >= k) hashMap.remove(getIdx(nums[i - k]));
        }
        return false;

    }

    long getIdx(long num) {
        return num >= 0 ? num / size : ((num + 1) / size) - 1;

    }


}
