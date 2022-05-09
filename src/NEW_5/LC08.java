package NEW_5;


//516. 最长回文子序列
//526. 优美的排列
//486. 预测赢家

public class LC08 {
    //516. 最长回文子序列
    public int longestPalindromeSubseq(String s) {
        char[] ss = s.toCharArray();
        if(s.length()==2){
            int x =  ss[0]==ss[1] ? 2 :1;
            return x;
        }
        if(s.length()==1) return 1;
        int[][] dp = new int[s.length()][s.length()];
        for (int i = s.length()-1; i >=0 ; i--) {
            dp[i][i]=1;
            for (int j = i+1; j < s.length(); j++) {
                if(ss[i]==ss[j]) dp[i][j] = dp[i+1][j-1]+2;
                else dp[i][j]=Math.max(dp[i+1][j],dp[i][j-1]);
            }
        }
        return dp[0][s.length()-1];
    }
    //526. 优美的排列
    public int countArrangement(int n) {
        return dfs( n , 1 , new boolean[n+1]);
    }

    private int dfs(int n, int i, boolean[] vi) {
        if(i>n) return 1;
        int ans = 0;
        for (int j = 1; j <= n ; j++) {
            if(!vi[j]&&(j%i==0||i%j==0)){
                vi[j] = true;
                ans+=dfs(n,i+1,vi);
                vi[j]=false;
            }
        }
        return ans;
    }
    //486. 预测赢家
    public boolean PredictTheWinner(int[] nums) {
        //先手取数为正，后手取数为负，返回结果大于0 则算先手胜利。
        return dfs(nums,0,nums.length-1,1)>0;
    }
    private int dfs(int[] nums, int l, int r, int index) {
        if(l==r) return nums[l]*index;
        //取数过后要求反转
        int left = nums[l]*index+dfs(nums,l+1,r,-index);
        int right = nums[r]*index+dfs(nums,l,r-1,-index);
        //如果这轮是先手取数 那么一定要取大的
        if(index==1) return Math.max(left,right);
        //如果这轮是后手取数 那么一定要取小的
        else return Math.min(left,right);
    }
    //486. 预测赢家
    public boolean PredictTheWinner1(int[] nums) {
        int[][] dp = new int[nums.length][nums.length];
        for (int i = 0; i < nums.length ; i++) {
            dp[i][i]=nums[i];
        }
        for (int i = nums.length-2; i >=0 ; i--) {
            for (int j = i+1; j < nums.length ; j++) {
                dp[i][j]=Math.max(nums[i]-dp[i+1][j],nums[j]-dp[i][j-1]);
            }
        }
        return dp[0][nums.length-1]>=0;
    }


}
