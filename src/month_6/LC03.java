package month_6;

public class LC03 {
    //91. 解码方法
    public static int numDecodings(String s) {
        if(s.charAt(0)=='0') return 0;
        int n = s.length();
        int[] f = new int[n + 1];
        f[0] = 1;
        f[1] = 1;
        for (int i = 2; i <= n; ++i) {
            if(s.charAt(i-1)!='0') f[i]+=f[i-1];
            if(s.charAt(i-1)<'7'&&s.charAt(i-2)=='2'||s.charAt(i-2)=='1')f[i]+=f[i-2];
        }
        return f[n];
    }

    public static void main(String[] args) {
        System.out.println(numDecodings("2101"));
    }




}
