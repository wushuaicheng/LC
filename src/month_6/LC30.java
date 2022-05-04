package month_6;
//338. 比特位计数
public class LC30 {
    public int[] countBits1(int n) {
        int[] ints = new int[n + 1];
        for (int i = 0; i <=n ; i++) {
            ints[i] = get(i);
        }
        return ints;

    }
    //位运算 减1后可以统计出含有1的个数
    private int get(int i) {
        int res = 0;
        while (i>0){
            i&=(i-1);
            res++;
        }
        return res;
    }

    public int[] countBits(int n) {
        int[] ints = new int[n + 1];
        int x = 0;

        for (int i = 1; i <=n ; i++) {
            if((i&(i-1))==0){
                x = i;
            }
            ints[i]=ints[i-x]+1;
        }
        return ints;

    }
}
