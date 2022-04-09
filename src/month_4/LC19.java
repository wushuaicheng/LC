package month_4;

import java.lang.reflect.Array;
import java.util.Arrays;

//60. 排列序列
public class LC19 {


    static int n ;
    static int k ;
    static int[] factorial;

    static boolean[] used;
    public String getPermutation(int n, int k) {

        this.n=n;
        this.k=k;
        calculateFactorial(n);
        used=new boolean[n+1];
        Arrays.fill(used,false);
        StringBuilder path = new StringBuilder();
        dfs(path,0);
        return path.toString();
    }

    private void dfs(StringBuilder path, int index) {
        if(index==n){
            return;
        }
        int cnt = factorial[n-1-index];
        for (int i = 1; i < n+1 ; i++) {
            if(used[i]){
                continue;
            }
            if(cnt<k){
                k-=cnt;
                continue;
            }
            path.append(i);
            used[i]=true;
            dfs(path,index+1);
            return;
        }
    }

    private void calculateFactorial(int n) {
        factorial=new int[n+1];
        factorial[0]=1;
        for (int i = 1; i < n+1; i++) {
            factorial[i]=factorial[i-1]*i;
        }
    }
}
