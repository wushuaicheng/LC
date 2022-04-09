package month_2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LC220222 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int result = nums[0]+nums[1]+nums[2];
        for(int i =0 ; i<nums.length-2 ; i++){
            int left = i+1;
            int right = nums.length-1;
            while(left!=right){
                int sum = nums[right]+nums[left]+nums[i];
                if(Math.abs(sum-target)<=Math.abs(result-target)) result=sum;
                if(sum>target){
                    right--;
                    while(left != right && nums[right] == nums[right+1])
                        right--;
                }else if (sum<target){
                    left++;
                    while(left != right && nums[left] == nums[left-1])
                        left++;
                }else{
                    return target;
                }


            }
        }
        return result;

    }
}
