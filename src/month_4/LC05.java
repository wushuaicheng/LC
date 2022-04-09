package month_4;
//50. Pow(x, n)
public class LC05 {
    /*public static double myPow(double x, int n) {
        int z = n;
        return z>0?quick(x,n):1/quick(x,-n);

    }
    public static double quick(double x, int n ){
        if(n==0) return 1.0;
        double y=quick(x,n/2);
        return n%2==0?y*y:y*y*x;
    }*/
    public static double myPow(double x, int n) {
        int z = n;
        return z>0?quick(x,n):1/quick(x,-n);

    }
    public static double quick(double x, int n ){
        if(n==0) return 1.0;
        double y = quick(x,n/2);
        return n%2==0?y*y:y*y*x;
    }



    public static void main(String[] args) {

        System.out.println(myPow(2,5));
    }


}
