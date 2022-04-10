package month_5;
//2042. 检查句子中的数字是否递增
public class LC03 {
    public boolean areNumbersAscending(String s) {
        String[] s1 = s.split(" ");
        int min = Integer.MIN_VALUE;
        for (int i = 0; i < s1.length; i++) {

            if(s1[i]!=""&&s1[i].charAt(0)<='9'&&s1[i].charAt(0)>='0'){

                if(Integer.valueOf(s1[i])>min){
                    min=Integer.valueOf(s1[i]);
                }else {
                    return false;
                }
            }
        }
        return true;
    }
}
