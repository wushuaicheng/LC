package month_2;

public class LC220220 {
    /* public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        if (i >= 0) {
            int j = nums.length - 1;
            while (j >= 0 && nums[i] >= nums[j]) {
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i + 1);
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void reverse(int[] nums, int start) {
        int left = start, right = nums.length - 1;
        while (left < right) {
            swap(nums, left, right);
            left++;
            right--;
        }
    }
}

     */
  /*  public void nextPermutation(int[] nums){
        int i = nums.length-2;
        while(i>=0&&nums[i]>=nums[i+1]) i--;
        if(i>=0){
            int j = nums.length-1;
            while(j>i&&nums[j]<=nums[i]) j--;
            swap(nums,i,j);
        }
        reverse(nums,i+1);

    } */

    private void reverse(int[] nums, int i) {
        int left = i;
        int right =nums.length-1;
        while(left<right){
            swap(nums,left,right);
            left++;
            right--;
        }
    }

    private void swap(int[] nums, int i, int j) {
        int x = nums[i];
        nums[i]=nums[j];
        nums[j]=x;
    }

    public void nextPermutation(int[] nums){
        int i = nums.length-2;
        while ((i>0&&nums[i]>=nums[i+1])) i--;
        if(i>=0){
            int j = nums.length-1;
            while(j>i&&nums[i]>=nums[j]) j--;
            swap(nums,i,j);
        }
        reverse(nums,i+1);

    }


}
