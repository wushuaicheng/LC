package month_3;

import java.util.Arrays;

public class LC24 {
    //556. 下一个更大元素 III 找到后找到比自己大的改变后 后面的再排序
    public static int  nextGreaterElement(int n) {
        char[] chars = String.valueOf(n).toCharArray();
        Boolean flag = false;
        int length = chars.length;
        int x = -1;
        for (int i = length-1; i >=0&&!flag ; i--) {
            int j = i -1;
            if(j >= 0 &&chars[i]>chars[j]){
                for (int k = length-1; k >=i ; k--) {
                    if(chars[j]<chars[k]){
                        char t = chars[j];
                        chars[j]=chars[k];
                        chars[k]=t;
                        flag=true;
                        x=i;
                        break;
                    }

                }
            }
            
        }
        if(flag==false) return -1;
        Arrays.sort(chars, x, length-1);
        try {
            return Integer.parseInt(new String(chars));
        } catch (Exception e) {
            return -1;
        }

    }

    public static void main(String[] args) {

        int[] a = {9, 8, 7, 2, 3, 4, 1, 0, 6, 5};

        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]+",");
        }
        System.out.println();
        Arrays.sort(a,1,3);
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]+",");
        }

    }

}
