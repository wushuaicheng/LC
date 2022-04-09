package month_3;

public class LC06 {
    //744. 寻找比目标字母大的最小字母
    public  static  char nextGreatestLetter(char[] letters, char target) {
        int r = letters.length -1 ;
        int l = 0 ;
        while(l<r){
            int mid = (l+r)>>1;
            if(letters[mid]>target){
                r=mid-1;
            }else {
                l=mid+1;
            }
        }
        return letters[l%letters.length];
    }

    public static void main(String[] args) {
        char[] letters={'c','f','j'};

        System.out.println(nextGreatestLetter(letters,'d'));

    }

}
