package month_1;

import java.util.HashMap;

/*
无重复序列长度

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int end = 0, start = 0; end < n; end++) {
            char alpha = s.charAt(end);
            if (map.containsKey(alpha)) {
                start = Math.max(map.get(alpha), start);
            }
            ans = Math.max(ans, end - start + 1);
            map.put(s.charAt(end), end + 1);
        }
        return ans;
    }
}

*/


public class LC220125 {
    public static void main(String[] args) {
        String s = "abcabcbb";
        int n = s.length();
        int ans = 0;
        HashMap<String, Integer> stringIntegerHashMap = new HashMap<>();
        for(int start = 0 ,end = 0 ; end<n ; end++){
            char x = s.charAt(end);
            if(stringIntegerHashMap.containsKey(Character.toString(x))){
                start = Math.max(stringIntegerHashMap.get(Character.toString(x)),start);
            }
            ans = Math.max(ans,end-start+1);
            stringIntegerHashMap.put(Character.toString(x),end+1);
        }
        System.out.println(ans);

    }
}

