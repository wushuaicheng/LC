package month_3;

import java.util.HashMap;
import java.util.Map;

public class LC10 {
    /*int mod = (int)1e9+7;
    public int countPairs(int[] ds) {
        int length = ds.length;
        int res = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i = 0 ; i < length ; i ++ ){
            int x = ds[i];
            for (int integer : hashMap.keySet()) {
                if(check(x+integer)) res+=hashMap.get(integer);
                hashMap.put(x,hashMap.getOrDefault(x,0)+1);
            }
        }
        return (int)(res % mod);
    }

    private boolean check(int i) {
        long cur = 1 ;
        if(cur<i) cur*=2;
        return cur==i;
    }*/
    int mod = (int)1e9+7;
    int max = 1 << 22;
    public int countPairs(int[] ds) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int d : ds) map.put(d,map.getOrDefault(d,0)+1);
        long ans = 0 ;
        for (int x : map.keySet()) {
            for(int i = 1  ; i < max ; i<<=1){
                int t = i-x;
                if(map.containsKey(t)){
                    if(t==x)  ans+= (map.get(x)-1)*map.get(x)* 1L;
                    else  ans+=map.get(x)*map.get(t)* 1L;
                }
            }
        }
        ans >>= 1;
        return (int)(ans % mod);
    }

}


   /*   int mod = (int)1e9+7;
    int max = 1 << 22;
    public int countPairs(int[] ds) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int d : ds) map.put(d, map.getOrDefault(d, 0) + 1);
        long ans = 0;
        for (int x : map.keySet()) {
            for (int i = 1; i < max; i <<= 1) {
                int t = i - x;
                if (map.containsKey(t)) {
                    if (t == x) ans += (map.get(x) - 1) * 1L * map.get(x);
                    else ans += map.get(x) * 1L * map.get(t);
                }
            }
        }
        ans >>= 1;
        return (int)(ans % mod);
    }*/