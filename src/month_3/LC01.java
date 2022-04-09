package month_3;

import java.lang.reflect.Array;
import java.util.*;

public class LC01 {

   public static List<List<String>> groupAnagrams(String[] strs) {
       HashMap<String, ArrayList<String>> stringListHashMap = new HashMap<>();
       for (String str : strs) {
           char[] chars = str.toCharArray();
           Arrays.sort(chars);
           String s = new String(chars);
           ArrayList<String> orDefault = stringListHashMap.getOrDefault(s, new ArrayList<String>());
           orDefault.add(str);
           stringListHashMap.put(s,orDefault);
       }
       return new ArrayList<List<String>>(stringListHashMap.values());

   }


}
