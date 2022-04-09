package month_4;

public class LC27 {
    public int[] subSort(int[] array) {
        int length = array.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int left = -1;
        int right = -1;
        for (int i = 0; i < length ; i++) {
            if(array[i]>max){
                max = array[i];
            }else {
                left = i;
            }
        }
        if (left==-1){
            return new int[] {-1,-1};
        }
        for (int i = left; i >= 0; i--) {
            if(array[i]<min){
                min = array[i];
            }else{
                right = i;
            }
        }
        return left>right?new int[] {right,left}:new int[] {left,right};


    }
}
