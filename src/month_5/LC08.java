package month_5;


import javax.swing.*;
//2086. 从房屋收集雨水需要的最少水桶数
public class LC08 {
    public static int minimumBuckets(String street) {
        /*if(street.length()<=1) {
            if(street=="H") return -1;
            else return 0;
        }*/

        if (street.length() == 0) {
            return 0;
        }
        if (street.length() == 1) {
            if (street.charAt(0) == 'H') return -1;
            else return 0;
        }
        char[] chars = street.toCharArray();
        int min = 0;
        if (chars[0] == 'H') {
            if (chars[1] == '.') {
                chars[1] = 'B';
                min++;
            } else return -1;
        }

        if (chars[chars.length - 1] == 'H') {
            if (chars[chars.length - 2] == '.') {
                chars[chars.length - 2] = 'B';
                min++;
            } else if (chars[chars.length - 2] == 'H') return -1;
        }


            for (int i = 1; i < chars.length - 1; i++) {
                if (chars[i] != 'H') continue;
                if (chars[i - 1] == 'B') continue;
                if (chars[i + 1] == 'B') continue;
                if (chars[i + 1] == '.') {
                    chars[i + 1] = 'B';
                    min++;
                } else if (chars[i - 1] == '.') {
                    chars[i - 1] = 'B';
                    min++;
                } else {
                    return -1;
                }
            }
            return min;

        }


    public static void main(String[] args) {
        System.out.println(minimumBuckets("H"));
    }
}
