package month_3;

import java.util.Arrays;

public class LC03 {
    /*public int numFriendRequests(int[] ages) {
        int ans = 0;
        Arrays.sort(ages);
        for(int i = 0 , j = 0 , k = 0; k<ages.length ; k++){
            while(i<k&&!check(ages[i],ages[k])) i++;
            if(j<k) j=k;
            while(j<ages.length&&check(ages[j],ages[k])) j++;
            if(j>i) ans+=j-i-1;
        }
        return ans;

    }
    boolean check(int x, int y) {
        if (y <= 0.5 * x + 7) return false;
        if (y > x) return false;
        if (y > 100 && x < 100) return false;
        return true;
    }*/
    //先构建桶 在构建前缀和 在进行筛选 +=
   /* public int numFriendRequests(int[] ages) {
        int ans = 0;
        int[] counts = new int[121];
        for (int age : ages) {
            counts[age]++;
        }
        int[] preSum = new int[121];
        preSum[0]=counts[0];
        for(int i = 1 ; i<counts.length ; i++){
            preSum[i]=preSum[i-1]+counts[i];
        }
        for(int i = 15 ; i<counts.length ; i++){
            if(counts[i]>0){
                int y = (int)(0.5 * i + 7);
                ans+=(preSum[i]-preSum[y]-1)*counts[i];
            }
        }
        return ans;
    }*/
    public int numFriendRequests(int[] ages){
        int ans = 0;
        Arrays.sort(ages);
        for(int i = 0,j=0,k=15;k<ages.length;k++){
            if(i<k&&!check(i,k)) i++;
            if(j<k) j=k;
            if(j<ages.length&&!check(j,k)) j++;
            if(j>i) ans+=j-i-1;
        }
        return ans;

    }
    public boolean check(int x, int y){
        if (y <= 0.5 * x + 7) return false;
        if (y > x) return false;
        return true;
    }

    public static void main(String[] args) {

    }
}
