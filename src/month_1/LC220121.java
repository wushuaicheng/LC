package month_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC220121 {

    public static void main(String[] args) {
        String s = "baaafggggg";

        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        int n = s.length();
        int num = 1;
        for (int i = 0; i < n; i++) {
            if (i == n - 1 || s.charAt(i) != s.charAt(i + 1)) {
                if (num >= 3) {
                    ret.add(Arrays.asList(i - num + 1, i));
                }
                num = 1;
            } else {
                num++;
            }
        }
    }
}


