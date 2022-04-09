package month_4;

import javax.print.DocFlavor;

public class LC13 {
    //326. 3 的幂

    public boolean isPowerOfThree1(int n) {
        if(n==1) return true;
        if(n<=0||n%3!=0) return false;
        return isPowerOfThree1(n/3);
    }

    public boolean isPowerOfThree(int n) {
        if(n == 1) return true;
        if(n == 0) return false;
        return n % 3 == 0 ? isPowerOfThree(n / 3) : false;
    }



}
