package month_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class LC16 {
    // 排列的数目 377
    public int[][] merge(int[][] intervals) {
        int index = 0;
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        ArrayList<int[]> list = new ArrayList<>();
        list.add(index++,intervals[0]);
        for(int i = 1 ; i < intervals.length ; i++){
            int[] x = list.get(index - 1);
            int[] y = intervals[i];

            if(x[1]>=y[0]){
                list.get(index-1)[1] = Math.max(x[1],y[1]);
            }else {
                list.add(index++,y);
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}
