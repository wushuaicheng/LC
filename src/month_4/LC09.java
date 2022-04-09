package month_4;

public class LC09 {
    public boolean isPowerOfTwo(int n) {
        int x= 1<<30;
        while (x<n){
            x=x*2;
        }
        return x==n;

    }

    public static boolean isPowerOfTwo1(int n) {
        long x = 1;
        return dfs(x,n)==n;
    }
    public static long dfs(long x ,int n){
        if(x>=n) return x;
        return dfs(x*2,n);
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo1(2));
    }

    public boolean isPowerOfTwo2(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}
