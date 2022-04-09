package month_3;

import java.util.Arrays;

public class LC25 {
    //1385. 两个数组间的距离值
    /*public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int res = 0 ;
        for (int i : arr1) {
            for (int i1 : arr2) {
                if(Math.abs(i-i1)<=d){
                    res++;
                    break;
                }
            }
        }
        return arr1.length-res;

    }*/
    public  int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int count = 0;
        for (int i : arr1) {
            int index = binarySearch(arr2,i);
            if(index == 0){
                if(Math.abs(arr2[index] - i) > d)
                    count++;
            } else if(index == arr2.length) {
                if(Math.abs(arr2[arr2.length-1] - i) > d)
                    count++;
            } else {
                if(Math.abs(arr2[index] - i) > d && Math.abs(arr2[index - 1] - i) > d)
                    count++;
            }

        }
        return count;
    }

    private static int binarySearch(int[] arr2, int i) {
        int l = 0 ;
        int r = arr2.length;
        while (l<=r){
            int mid = (l-r)/2+r;
            if(arr2[mid]>i){
                r=mid-1;
            }else if(arr2[mid]<i){
                l=mid+1;
            }else {
                return mid;
            }
        }
        return l;
    }


}
