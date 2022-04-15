package month_5;

import org.omg.CORBA.MARSHAL;

import java.util.HashSet;

public class LC14 {
    public static  int maximumUniqueSubarray(int[] nums) {
        if(nums.length==0) return 0;
        HashSet<Integer> set = new HashSet<>();
        int temp = 0;
        int max = 0;
        //左右指针
        int left = 0 , right = 0;
        while (right<nums.length){
            //不存在则将他放入set
            if(!set.contains(nums[right])) {
                set.add(nums[right]);
                temp+=nums[right];
                //每次增加后判断max的值
                max = Math.max(temp,max);
                right++;
            }else{
                //存在，一直向后寻找直到找到那个重复的
                while (set.contains(nums[right])){
                    set.remove(nums[left]);
                    temp-=nums[left];
                    left++;
                   }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] ss = {10000,1,10000,1,1,1,1,1,1};
        System.out.println(maximumUniqueSubarray(ss));
    }
}
