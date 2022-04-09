package month_1;

public class LC220127 {
 /*   class Solution {
        public int reverse(int x) {
            int res = 0;
            while(x!=0) {
                //每次取末尾数字
                int tmp = x%10;
                //判断是否 大于 最大32位整数
                if (res>214748364 || (res==214748364 && tmp>7)) {
                    return 0;
                }
                //判断是否 小于 最小32位整数
                if (res<-214748364 || (res==-214748364 && tmp<-8)) {
                    return 0;
                }
                res = res*10 + tmp;
                x /= 10;
            }
            return res;
        }
    }*/


    public static void main(String[] args) {

        int x = 12345;
        int res = 0 ;
        if(x!=0){
            int tmp = x%10;
            if (res>214748364 || (res==214748364 && tmp>7)) {
                //return 0;
            }

            if (res<-214748364 || (res==-214748364 && tmp<-8)) {
                //return 0;
            }
            res = res*10+tmp;
            x/=10;
        }
        //return res;

    }
}
