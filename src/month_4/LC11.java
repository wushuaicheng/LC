package month_4;
//233. 数字 1 的个数
public class LC11 {
    //暴力
    public int countDigitOne(int n) {

        int ans = 0;
        for (int i = 1; i <= n; i *= 10) {
            ans += (n / (i * 10)) * i + Math.min(Math.max(n % (i * 10) - i + 1,0), i);
        }
        return ans;
    }

    //数字位数拆分dp
    public int countDigitOne2(int n) {
        int ans = 0;
        int[] dp = new int[n + 1];
        dp[1] = 1;
        for (int i = 1; i <= n; i++) {
            dp[i] = dp[i % 10] + dp[i / 10];
            ans += dp[i];
        }
        return ans;
    }
    //位数前中后拆分计算
    public int countDigitOne3(int n) {
        String s = String.valueOf(n);
        char[] chars = s.toCharArray();
        int length = s.length();
        if(s.length()==1) return n>=1?1:0;
        int[] before = new int[length];
        int[] after = new int[length];
        before[length-1]=Integer.valueOf(s.substring(0,length-1));
        for(int i =1 ; i < length-1; i++ ){
            before[i]=Integer.valueOf(s.substring(0,i));
            after[i]=Integer.valueOf(s.substring(i+1));
        }
        after[0]=Integer.valueOf(s.substring(1));
        int res = 0;
        for(int i = 0 ; i < length ; i++ ){
            int total = 0;
            int x = chars[i]-'0';
            int len = length-i-1;
            int be = before[i];
            int af = after[i];
            total+= be * Math.pow(10,len);
            if(x==0){

            }else if(x==1){
                total+=af+1;
            }else {
                total+=Math.pow(10,len);
            }
            res+=total;
        }
        return res;
    }


}
