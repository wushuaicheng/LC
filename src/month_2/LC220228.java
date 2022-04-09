package month_2;

public class LC220228 {
    public int removeElement(int[] nums, int val) {
        int left = 0 ;
        int right  =nums.length;
        while(left<right) {
            if(nums[left]==val){
                nums[left]=nums[right];
                right--;
            }else {
                left++;
            }
        }
        return left;
    }
}
