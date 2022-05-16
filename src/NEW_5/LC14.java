package NEW_5;

import java.util.HashMap;

public class LC14 {

    public int maxScore(int[] cardPoints, int k) {
        int max = 0 ;
        int temp = 0;
        int right = cardPoints.length-1;
        for (int i = 0; i <= k-1 ; i++) {
            temp+=cardPoints[i];
            max = temp;
        }
        for (int i = k-1; i >=0 ; i--) {
            temp-=cardPoints[i];
            temp+=cardPoints[right];
            right--;
            max= Math.max(temp,max);
        }
        return max;
    }

    public static int numOfSubarrays(int[] arr) {
        int even = 0;
        int odd = 0;
        int x = 1000000007;
        int temp = 0;
        for (int i : arr) {
            temp+=i;
            if(temp%2==0) even++;
            else odd++;
        }
        return (int) ((long)even*odd%x+odd%x);
    }

    public static void main(String[] args) {
        System.out.println(numOfSubarrays(new int[] {64,69,7,78,31,83,47,84,47,6,67}));
    }




}
