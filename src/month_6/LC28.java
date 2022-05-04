package month_6;

public class LC28 {
    public int search(int[] nums, int target) {
        if(nums.length==0) return -1;
        int l = 0;
        int r = nums.length-1;
        int mid = 0;
        while(l<=r){
            mid = (l+r)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]<target){
                l=mid+1;
            }else {
                r=mid-1;
            }
        }
        return -1;
    }
}
