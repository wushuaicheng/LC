package month_6;

import java.util.ArrayList;
import java.util.List;

public class LC18 {
    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> pre = new ArrayList<>();
        ArrayList<Integer> cur = null;
        for (int i = 0; i < rowIndex ; i++) {
            cur = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if(j==0||j==i) cur.add(1);
                else cur.add(pre.get(j)+pre.get(j-1));
            }
            pre=cur;
        }
        return cur;
    }
}
