package month_4;

import javax.swing.*;

//135. 分发糖果
public class LC25 {
    public static int candy(int[] ratings) {
        int length = ratings.length;
        int[] candy = new int[length];
        for (int i = 0; i < length; i++) {
            candy[i]=1;
        }
        for(int i = 1 ; i < ratings.length ; i++ ){
            if(ratings[i]>ratings[i-1]){
                candy[i]=candy[i-1]+1;
            }
        }
        for(int i = ratings.length-2 ; i >= 0 ; i-- ){
            if(ratings[i]>ratings[i+1]){
                candy[i]=Math.max(candy[i],candy[i+1]+1);
            }
        }
        int sum = 0;
        for (int i : candy) {
            System.out.println(i);
            sum+=i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] ints = {1,3,4,5,2};
        System.out.println(candy(ints));


    }
 }
