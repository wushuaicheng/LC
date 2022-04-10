package month_5;
//剑指 Offer 10- I. 斐波那契数列
public class LC02 {
    public int fib(int n) {
        if(n<=1) return n;

       int a = 0;
       int b = 1;
       int c = 0;
       int x = 1000000007;
       for (int j = 1; j < n ; j++) {
            c=(a+b)%x;
            a=b;
            b=c;
       }
       return c;
    }
}
