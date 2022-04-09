package month_3;

import java.util.Stack;

public class LC23 {
    public int monotoneIncreasingDigits(int n) {
        char[] chars = String.valueOf(n).toCharArray();
        int i = 1 ;

        while(i<chars.length&&chars[i-1]<=chars[i]) i++;
        if(i<chars.length){
           while (i>0&&chars[i-1]>chars[i]){
               chars[i - 1] -= 1;
               i--;

           }
           for(i=i+1; i<chars.length ; i++){
               chars[i]='9';
           }
        }
        return Integer.parseInt(new String(chars));
    }

}
