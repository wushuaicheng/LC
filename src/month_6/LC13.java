package month_6;
//152. 乘积最大子数组
public class LC13 {
    public int maxProduct(int[] nums) {
        int length = nums.length;
        int[] dpMin = new int[length + 1];
        int[] dpMax = new int[length + 1];
        int res = nums[0];
        dpMax[0]=nums[0];
        dpMin[0]=nums[0];
        for (int i = 1; i < length ; i++) {
            dpMax[i]=Math.max(nums[i],Math.max(dpMin[i-1]*nums[i],dpMax[i-1]*nums[i]));
            dpMin[i]=Math.min(nums[i],Math.min(dpMin[i-1]*nums[i],dpMax[i-1]*nums[i]));
            res=Math.max(res,dpMax[i]);
        }
        return res;

    }
}
