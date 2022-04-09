package month_3;

public class LC18 {
    //#258 各位相加
    public  static  int addDigits(int num) {
       int res= 0;
       while(num>=10){
           res+=num%10;
           num/=10;
           if(num<10){
               num+=res;
               res=0;
           }
       }
       return num;
    }
}

   /* public int addDigits(int num) {
        while (num >= 10) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }*/
