package NEW_5;

import java.beans.IntrospectionException;
import java.util.*;

//264. 丑数 II
//263. 丑数
public class LC05 {
    public int nthUglyNumber1(int n) {
        HashSet<Long> set = new HashSet<>();
        int[] ints = {2,3,5};
        PriorityQueue<Long> queue = new PriorityQueue<>();
        set.add(1L);
        queue.add(1L);
        int res = 0;
        long poll = 0L;
        for (int i = 0; i < n; i++) {
            poll =  queue.poll();
            res =(int) poll;
            for (int anInt : ints) {
                Long temp = anInt*poll;
                if(set.add(temp)){
                    queue.add(temp);
                }
            }
        }
        return res;
    }
    public int nthUglyNumber(int n) {
        //初始话他们的乘数 都是店dp[0]；
        int n2 = 0;
        int n3 = 0;
        int n5 = 0;
        //初始化他们的结果
        int r2;
        int r3;
        int r5;
        int min = 999;
        int[] dp = new int[n];
        dp[0]=1;
        for (int i = 1; i < n; i++) {
            //计算结果
            r2 = dp[n2]*2;
            r3 = dp[n2]*3;
            r5 = dp[n2]*5;
            //取出最小值
            min = Math.min(r2,Math.min(r3,r5));
            dp[i]=min;
            //当最小值为某个结果时，对应的指针++。
            if(min ==r2) n2++;
            if(min ==r3) n3++;
            if(min ==r5) n5++;
        }
        return dp[n-1];
    }
    public boolean isUgly(int n) {
        if(n==0) return false;
        int[] ss = {2,3,5};
        for (int s : ss) {
            while (n%s==0) n/=s;
        }
        return n==1;

    }


}


