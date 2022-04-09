package month_3;

import java.util.Scanner;
//完美数
public class LC27 {
    public boolean checkPerfectNumber(int num) {
        if(num==1) return false;
        int sum = 1;
        for (int i = 2; i*i <= num ; i++) {
            if (num%i==0){
                sum+=i;
                if(i*i!=num) {
                    sum += num / i;
                }

            }

        }
        return sum==num;

    }
}


