package month_5;

import java.util.Arrays;

public class LC25duipaixu {
    public static void duipaixu(){
        int[] arr = {4,6,8,7,7,3,2,7,7,7,5,67,5,5,9};
        //第一次使他成为一个真正的堆
        for (int i =arr.length /2-1; i>=0; i--) {
            adjestHeap(arr,i,arr.length);
        }
        int temp = 0;
        //取走第一个后，每次子需要从上到下来一次就行了
        for (int i = arr.length-1; i >0 ; i--) {
            temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            adjestHeap(arr,0,i);
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void adjestHeap(int[] arr , int i , int length){
        int temp = arr[i];
        //最后赋值，减少交换量。
        for(int k =i*2+1; k<length;k=k*2+1){
            if(k+1<length&&arr[k]<arr[k+1]) k++;
            if(arr[k]>temp){
                arr[i]=arr[k];
                i=k;
            }else break;
        }
        arr[i]=temp;
    }
    public static void main(String[] args) {
        duipaixu();
    }
}
