package month_4;

public class LC23 {


    public static long quick(long x, long n ){
        if(n==0) return 1L;
        long y = quick(x,n/2);
        return n%2==0? y*y%MOD: y*y*x%MOD ;
    }
    public static final long MOD = (long)(1e9 + 7);
    public int countGoodNumbers(long n) {
        long x = (long)(n / 2);     // 求奇数个数
        long y = (long)((n +1) / 2); // n - 奇数 = 偶数

        return (int)(quick(4,x)*quick(5,y)%MOD);
    }





}
