package month_5;

//55. 跳跃游戏
public class LC27 {
    public static boolean canJump(int[] nums) {
        int max = nums[0];
        for (int i = 0; i <= max; i++) {
            max = Math.max(max,i+nums[i]);
            if( max>=nums.length-1) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1};
        System.out.println(canJump(arr));

    }

}
