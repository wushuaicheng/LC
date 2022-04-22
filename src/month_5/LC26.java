package month_5;

//45. 跳跃游戏 II
public class LC26 {
    public int jump1(int[] nums) {
        int length = nums.length-1;
        int step = 0;
        while (length>0){
            for (int i = 0; i <length ; i++) {
                if (i+nums[i]>=length){
                    length=i;
                    step++;
                    break;
                }
            }
        }
        return step;
    }
    public int jump(int[] nums) {
        int max = 0;
        int step = 0;
        int end = 0;
        for (int i = 0; i <nums.length-1 ; i++) {
            max=Math.max(max,i+nums[i]);
            if(i==end){
                end=max;
                step++;
            }
        }
        return step;
    }

}
