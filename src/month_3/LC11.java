package month_3;

public class LC11 {
    //718. 最长重复子数组
    /*public static int findLength(int[] A, int[] B) {
        int a = A.length;
        int b = B.length;
        int[][] dp = new int[a+1][b+1];
        dp[0][0]=0;
        int res=0;
        for(int i = 0 ; i < a ; i ++){
            for(int j = 0 ; j < b ; j ++){
                dp[i+1][j+1]=A[i]==B[j]?dp[i][j]+1:0;
                res=Math.max(res,dp[i+1][j+1]);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a= {1,2,3,2,1};
        int[] b= {3,2,1,4,7};
        System.out.println( findLength(a,b));

    }*/

    public int findLength(int[] A, int[] B){
        return A.length>B.length?findLengthHelper(A,B):findLengthHelper(B,A);
    }

    public int findLengthHelper(int[] A, int[] B) {
        int a = A.length;
        int b = B.length;
        int total = a+b-1;
        int max = 0;


        for(int i = 0 ; i < total ; i++ ){
            int aStart=0;
            int bStart=0;
            int len = 0 ;
            if(i<b){
                 aStart = 0;
                 bStart = b-1-i;
                 len = i+1;
            }else {
                bStart=0;
                aStart=i-b+1;
                len=Math.min(a-aStart,b);
            }
            int maxlen = maxLength(A, B, aStart, bStart, len);
            max = Math.max(max, maxlen);

        }


        return max;
    }

    private int maxLength(int[] A, int[] B, int aStart, int bStart, int len) {
        int max = 0, count = 0;
        for (int i = 0; i < len; i++) {
            if (A[aStart + i] == B[bStart + i]) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 0;
            }
        }
        return max;
    }



}
