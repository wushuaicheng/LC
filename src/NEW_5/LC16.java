package NEW_5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LC16 {
    //1124. 表现良好的最长时间段
    public static int longestWPI(int[] hours) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int res = 0;
        int sum = 0;
        int temp = 0;
        for (int i = 0; i < hours.length; i++) {
            temp=hours[i]>8?1:-1;
            sum+=temp;
            if(sum>0) res = i + 1;
            else{
                if(!map.containsKey(sum)) map.put(sum,i);
                if(map.containsKey(sum-1)) res = Math.max(res,i-map.get(sum-1));
            }
        }
        return res;
    }

    //1371. 每个元音包含偶数次的最长子字符串
    public int findTheLongestSubstring(String s) {
        int[] pattern = new int[1 << 5];
        Arrays.fill(pattern,-2);
        pattern[0]=-1;
        int temp = 0;
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)){
                case 'a': temp ^= 1<<0; break;
                case 'e': temp ^= 1<<1; break;
                case 'i': temp ^= 1<<2; break;
                case 'o': temp ^= 1<<3; break;
                case 'u': temp ^= 1<<4; break;
            }
            if (pattern[temp]==-2) pattern[temp]=i;
            else res = Math.max(res,i-pattern[temp]);
        }
        return res;
    }

}
