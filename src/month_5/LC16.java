package month_5;

public class LC16 {
    public int subarraysDivByK(int[] nums, int k) {
        //不需要map，可以构造一个ints存放0到k-1，也就是%k的余数。
        int[] ints = new int[k];
        //数字本身可被K整除可以直接作为res返回 所以本身应该加1。
        ints[0]=1;
        int res = 0;
        int temp = 0;
        for (int i = 1; i <= nums.length; i++) {
            temp+=nums[i-1];
            //同余定理，先看数组中有么有同余的，有就res+。
            res+=ints[(temp%k+k)%k];
            //不管有没有都要ints[]++。
            ints[(temp%k+k)%k]++;
        }
        return res;
    }
}