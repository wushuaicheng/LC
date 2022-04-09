package month_4;

import java.util.HashSet;

public class LC26 {
    public int countTriples(int n) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 1; i < n; i++) {
            set.add(i*i);
        }
        int ans = 0;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if(set.contains(i*i+j*j)) ans++;

            }


        }
        return ans;
    }
}
