package month_5;

import org.omg.PortableInterceptor.INACTIVE;

import java.lang.reflect.GenericDeclaration;
import java.util.ArrayList;
import java.util.Arrays;

public class LC20PaiXu {
    //冒泡排序,每次for将最小的放到最后面
    public static void maopao(){
        int[] arr = {3,9,-1,10,20};
        System.out.println(Arrays.toString(arr));
        boolean flag = true;
        for (int i = 1; i < arr.length; i++) {
            flag = true;
            int temp = 0;
            for (int j = 0; j < arr.length-i; j++) {
                if(arr[j]>arr[j+1]){
                    temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    flag=false;
                }
            }
            if(flag) break;;
            System.out.println(i);
            System.out.println(Arrays.toString(arr));

        }
        System.out.println(Arrays.toString(arr));
    }

    //选择，每次将最小和最前面的交换
    public static void xuanze() {
        int[] arr = {3, 9, -8, -1, 22, 10, 20};
        int min = 0;
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) if (arr[j] < arr[min]) min = j;
            if(min!=i){
                temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    //插入，每次和前面有序进行比较，将元素后移然后覆盖
    public static void insert(){
        int[] arr = {9, 3, -8, -1, 22, 10, 20};
        int temp = 0;
        int index = 0;
        for (int i = 1; i < arr.length-1; i++) {
            temp=arr[i];
            index=i-1;
            while (index>=0&&temp<arr[index]){
                arr[index+1]=arr[index];
                index--;
            }
            if(index!=i-1) arr[index+1]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    //希尔排序的交换
    public static void xier() {
        int[] arr = {9, 3, -8, -1, 22, 10, 20};
        int temp = 0;
        for (int i = arr.length / 2; i >= 1; i /= 2) {
            for (int j = i; j < arr.length; j++) {
                for (int k = j - i; k >= 0; k -= i) {
                    if (arr[k] < arr[k + i]) {
                        temp = arr[k];
                        arr[k] = arr[k + i];
                        arr[k + i] = temp;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    //希尔排序的位移
    public static void xier1() {
        int[] arr = {9, 3, -8, -1, 22, 10, 20};
        int temp = 0;
        for (int i = arr.length / 2; i >= 1; i /= 2) {
            for (int j = i; j < arr.length; j++) {
                int k = j;
                temp = arr[k];
                if(temp<arr[j-i]){
                    while (k-i>=0&&temp < arr[k - i]){
                        arr[k]=arr[k-i];
                        k-=i;
                    }
                    arr[k]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    //快排
    public static void quickSort(int[] arr,int low,int high){
        int i,j,temp,t;
        if(low>high){
            return;
        }
        i=low;
        j=high;
        //temp就是基准位
        temp = arr[low];

        while (i<j) {
            //先看右边，依次往左递减
            while (temp<=arr[j]&&i<j) {
                j--;
            }
            //再看左边，依次往右递增
            while (temp>=arr[i]&&i<j) {
                i++;
            }
            //如果满足条件则交换
            if (i<j) {
                t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
            }

        }
        //最后将基准为与i和j相等位置的数字交换
        arr[low] = arr[i];
        arr[i] = temp;
        //递归调用左半数组
        quickSort(arr, low, j-1);
        //递归调用右半数组
        quickSort(arr, j+1, high);
    }



    //分治
    public static void mergeSort(int[] arr , int left ,int right , int[] tmp){
        if(left<right){
            int mid = (left+right)/2;
            mergeSort(arr,left,mid,tmp);
            mergeSort(arr,mid+1,right,tmp);
            merge(arr,left,mid,right,tmp);
        }

    }
    //分治
    public static void merge(int[] arr , int left , int mid , int right , int[] tmp){
        int i = left;
        int j = mid+1;
        int t = 0;
        while (i<=mid&&j<=right){
            if(arr[i]<arr[j]){
                tmp[t]=arr[i];
                t++;
                i++;
            }else {
                tmp[t]=arr[j];
                t++;
                j++;
            }
        }
        while(i<=mid){
            tmp[t]=arr[i];
            i++;
            t++;
        }
        while(j<=right){
            tmp[t]=arr[j];
            j++;
            t++;
        }
        for (int k = 0; k < t ; k++) arr[left+k]=tmp[k];
        System.out.println(111);
    }

    //基数排序
    public static void jishu(){
        int[] arr = {82,4,15,7,1,32,6,2,83,2};
        int max = 0;
        for (int i : arr) {
            if(i>max) max = i;
        }
        int num = 1;
        while (max/10!=0) {
            max/=10;
            num++;
        }
        int[] bucketNum = new int[10];
        int[][] bucket = new int[10][arr.length];
        int temp = 0;
        int index = 0;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < arr.length; j++) {
                temp = (int) (arr[j]/Math.pow(10,i)%10);
                bucket[temp][bucketNum[temp]]=arr[j];
                bucketNum[temp]++;
            }

            index=0;
            for (int j = 0; j < 10; j++) {
                if(bucketNum[j]!=0){
                    for (int k = 0; k < bucketNum[j]; k++) {
                        arr[index]=bucket[j][k];
                        index++;
                    }
                }

            }
            Arrays.fill(bucketNum,0);
        }
        System.out.println(Arrays.toString(arr));
    }


    //二分查找，插值
    public static int erfenchazhao(int[] arr ,int left ,int right , int targe){
        if(left>right||targe>arr[arr.length-1]||targe<arr[0]) return -1;
        //int mid = (left+right)/2;
        int mid = left+((targe-arr[left])/(arr[right]-arr[left]))*(right-left);
        if(arr[mid]==targe) return mid;
        else if(arr[mid]>targe) return erfenchazhao(arr,left,mid-1,targe);
        else return erfenchazhao(arr,mid+1,right,targe);
    }

    //斐波那契额
    public static int feibonaqie(int[] arr,int targe){
        int l = 0;
        int r = arr.length-1;
        int[] f = fib();
        int k = 0;
        int mid = 0;
        while (r>f[k]-1) k++;
        int[] temp = Arrays.copyOf(arr,f[k]);
        for (int i = r+1; i < temp.length; i++) temp[i]=arr[r];
        while (l<=r){
            mid=l+f[k-1]-1;
            if(targe<temp[mid]){
                r=mid-1;
                k--;
            }else if(targe>temp[mid]){
                l=mid+1;
                k-=2;
            }else {
                if(mid<=r) return mid;
                else return r;
            }
        }
        return -1;
    }
    public static int[] fib(){
        int[] f = new int[20];
        f[0]=1;
        f[1]=1;
        for (int i = 2; i < 20; i++) {
            f[i]=f[i-1]+f[i-2];
        }
        return f;
    }


    public static void main(String[] args){
        int[] arr = {1, 2, 2, 4, 6, 7, 15, 32, 82, 83};
        System.out.println(feibonaqie(arr,4));

    }
}
