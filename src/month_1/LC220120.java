package month_1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LC220120 {
    public static void main(String[] args) {
        int[][] image={{1,1,0},{1,0,1},{0,0,0}};
        for (int[] ints : image) {
            int data[] = new int[ints.length];
            int j = 0;
            for (int i =ints.length-1;i>=0;i--) {

                if(ints[i]==1){
                    data[j]=0;
                    j++;
                }else{
                    data[j]=1;
                    j++;
                }
            }
            for (int i =0;i<ints.length;i++){
                ints[i]=data[i];
            }
        }
        for (int[] ints : image) {
            System.out.print(Arrays.toString(ints)+",");
        }
        
    }
}
