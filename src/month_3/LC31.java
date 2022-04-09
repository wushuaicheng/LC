package month_3;

public class LC31 {
    //680. 验证回文字符串 Ⅱ
    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        while(left<=right){
            if(s.charAt(left)!=s.charAt(right)){
                return choice(s,left+1,right)|| choice(s,left,right-1);
            }
            left++;
            right--;
        }
        return true;

    }
    public boolean choice(String s,int left,int right){
        while(left<=right){
            if(s.charAt(left)!=s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}
