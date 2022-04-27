package month_6;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;

//kmp
public class LC07kmp {
    public static int kmp(String s1,String s2){
        int length = s2.length();
        int[] next = new int[length];
        for (int i = 1,j = 0; i < length; i++) {
            while (j>0&&s2.charAt(i)!=s2.charAt(j)) j=next[j-1];
            if(s2.charAt(i)==s2.charAt(j)) j++;
            next[i]=j;
        }
        for (int i = 0,j = 0; i < s1.length(); i++) {
            while (j>0&&s1.charAt(i)!=s2.charAt(j)) j=next[j-1];
            if(s1.charAt(i)==s2.charAt(j)) j++;
            if(j==length) return i - j + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println( kmp("BBC ABCDAB ABCDABCDABDE","ABCDABD"));

    }
}
