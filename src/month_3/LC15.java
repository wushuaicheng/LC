package month_3;

public class LC15 {
    //56. 合并区间
    /*public int[][] merge(int[][] intervals) {
        int index = 0 ;

        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        ArrayList<int[]> ints = new ArrayList<>();
        ints.add(index++,intervals[0]);
        for(int i = 1 ; i < intervals.length ; i ++){
            int[] x = ints.get(index - 1);
            int[] y = intervals[i];
            if (y[0]<=x[1]){
                ints.get(index-1)[1]=Math.max(x[1],y[1]);
            }else {
                ints.add(index++,y);
            }
        }
        return ints.toArray(new int[ints.size()][]);

    }*/
}
