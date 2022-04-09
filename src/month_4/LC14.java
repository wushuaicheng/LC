package month_4;
//344. 反转字符串
public class LC14 {
    public static void reverseString1(char[] s) {
        if(s.length<=1) return;
        int left = 0;
        int right = s.length-1;
        while (left<=right){
            char temp =s[left];
            s[left]=s[right];
            s[right]=temp;
            left++;
            right--;
        }
    }



}
