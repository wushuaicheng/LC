package month_3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.stream.Stream;

//按照频率将数组升序排序
public class LC30 {
    //桶排序
    public int[] frequencySort1(int[] nums) {
        int[] res = new int[201];
        //计数+100
        for (int num : nums) {
            res[num+100]++;
        }
        //构造新num
        for (int i = 0; i < nums.length ; i++) {
            nums[i]=201*res[nums[i]+100]+100-nums[i];
        }
        //排序
        Arrays.sort(nums);
        //还原
        for (int i = 0; i < nums.length ; i++) {
            nums[i]=100-nums[i]%201;
        }
        return nums;
    }
    public int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int num : nums) {
            hashMap.put(num,hashMap.getOrDefault(num,0)+1);
        }
        Integer[] integers = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Arrays.sort(integers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return hashMap.get(o1)==hashMap.get(o2)?o2-o1:hashMap.get(o1)-hashMap.get(o2);
            }
        });
        int[] ints = Arrays.stream(integers).mapToInt(Integer::valueOf).toArray();
        return ints;

    }


}
