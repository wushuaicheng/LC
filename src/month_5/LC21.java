package month_5;

public class LC21 {
    //1413. 逐步求和得到正数的最小值
    public static int minStartValue(int[] nums) {
        int min = Integer.MAX_VALUE;
        int count = 0;
        for (int num : nums) {
            count+=num;
            if(count<min) min=count;
        }
        return min>0?1:1-min;
    }

    public static void main(String[] args) {
        int[] ss = {-3,2,-3,4,2};
        System.out.println(minStartValue(ss));
    }
}
