package month_4;
//342. 4的幂
public class LC15 {
    public static boolean isPowerOfFour(int n) {
        if(n<0)return false;
        if(n==1) return true;
        return n%4!=0?false:isPowerOfFour(n/4);
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfFour(7867876));

    }
}
