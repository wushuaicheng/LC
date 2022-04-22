package month_5;

import javax.swing.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

//447. 回旋镖的数量
public class LC18 {
    public int numberOfBoomerangs(int[][] points) {
        if(points.length<=1) return 0;
        int res = 0;
        //第一次遍历
        for (int[] point : points) {
            HashMap<Integer, Integer> hashMap = new HashMap<>();
            for (int[] ints : points) {
                //第二次，一开始做的时候做了个if判断去掉两次重复的情况，后来发现不影响结果，就没必要去掉了。
                int x = (point[0]-ints[0])*(point[0]-ints[0])+(point[1]-ints[1])*(point[1]-ints[1]);
                hashMap.put(x,hashMap.getOrDefault(x,0)+1);
            }
            //遍历map，取出结果。
            for(Integer values : hashMap.values()){
                res+=values*(values-1);
            }
        }
        return res;
    }
}
