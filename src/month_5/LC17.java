package month_5;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class LC17 {
    public int findMinArrowShots(int[][] points) {
        //判断0和1的情况
        if(points.length<=1) return points.length;
        //右端排序
        Arrays.sort(points, (o1,o2)-> o1[1]>=o2[1]?1:-1);
        int temp = points[0][1];
        //本身应该用一箭，所以初始为一。
        int res = 1;
        for (int i = 1; i < points.length ; i++) {
            //如果下一个的左端大于本身的右端 则加一，并且更新temp为新的右端。
            if(points[i][0]>temp) {
                res++;
                temp=points[i][1];
            }
        }
        return res;
    }
}
