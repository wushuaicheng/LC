package month_3;

public class LC26 {
    public int removeDuplicates(int[] nums) {
        int length = nums.length;
        int slow = 0;
        int fast = 1;
        while(fast<length){
            if(nums[fast]!=nums[slow]) {
                nums[slow++]=nums[fast];
            }
            fast++;

        }
        return slow;
    }

}
