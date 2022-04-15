package month_5;

import Utils.ListNode;
import Utils.TreeNode;

public class LC10 {
    public int strStr(String haystack, String needle) {
        char[] haystacks = haystack.toCharArray();
        char[] needles = needle.toCharArray();
        int m = needle.length();
        int n = haystack.length();
        int[] next = new int[m];
        for (int i = 1 , j = 0; i < m ; i++) {
            while (j>0&&needles[i]!=needles[j]) j=next[j-1];
            if(needles[i]==needles[j]) j++;
            next[i]=j;
        }
        for (int i = 0 , j = 0 ; i < n; i++) {
            while (j>0&&needles[j]!=haystacks[i]) j=next[j-1];
            if(needles[j]==haystacks[i]) j++;
            if(j==m) return i-m+1;
        }

        return -1;
    }



}
