package month_3;
//1266. 访问所有点的最小时间
public class LC28 {
    public static  int minTimeToVisitAllPoints(int[][] points) {
        int length = points.length;
        int res = 0;
        for (int i = 1; i < length-1 ; i++) {
            int[] point1 = points[i];
            int[] point2 = points[i-1];
            int x = Math.abs(point1[0]-point2[0]);
            int y = Math.abs(point1[1]-point2[1]);
            res+=Math.max(x,y);
        }
        return res;
    }

    public static void main(String[] args) {
        int points[][] = {{1,1},{3,4},{-1,0}};
        minTimeToVisitAllPoints(points);

    }

}
