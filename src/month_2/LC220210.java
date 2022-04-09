package month_2;

import java.util.ArrayList;
import java.util.List;

public class LC220210 {
    class Solution {
        int gcd(int a, int b) { // 欧几里得算法
            return b == 0 ? a : gcd(b, a % b);
        }
        public List<String> simplifiedFractions(int n) {
            List<String> ans = new ArrayList<>();
            for (int i = 1; i < n; i++) {
                for (int j = i + 1; j <= n; j++) {
                    if (gcd(i, j) == 1) ans.add(i + "/" + j);
                }
            }
            return ans;
        }
    }

    class Solution1 {
        int gcd(int a, int b) {
            return b == 0 ? a : gcd(b, a % b);
        }
        public List<String> simplifiedFractions1(int n){
            List<String> ans = new ArrayList<String>();
            for(int i =1 ; i<n ;i++){
                for(int j = i+1 ; i<=n ; i++){
                    if(gcd(i,j)==1) ans.add(i + "/" + j);
                }
            }
            return ans;
        }

    }

}
