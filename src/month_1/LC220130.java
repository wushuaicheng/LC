package month_1;

public class LC220130 {
   /* public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0)
            return "";
        String ans = strs[0];
        for(int i =1;i<strs.length;i++) {
            int j=0;
            for(;j<ans.length() && j < strs[i].length();j++) {
                if(ans.charAt(j) != strs[i].charAt(j))
                    break;
            }
            ans = ans.substring(0, j);
            if(ans.equals(""))
                return ans;
        }
        return ans;
    }*/
   public String longestCommonPrefix(String[] strs) {
      if(strs.length == 0)
          return "";
      String ans = strs[0];
      for(int i = 1 ; i<strs.length ; i++){
          int j = 0;
          for(; j<ans.length()&&j<strs[i].length() ; j++) {
              if (ans.charAt(j) != strs[i].charAt(j))
                  break;
          }
          ans = ans.substring(0,j);
          if(ans.equals(""))
              return "";
      }
      return ans;
   }


}
/*

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0)return "";

        String s=strs[0];
        for (String string : strs) {
            while(!string.startsWith(s)){
                if(s.length()==0)return "";

                s=s.substring(0,s.length()-1);
            }
        }
        return s;
    }
}


class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        String minStr =strs[0];

        for(String str : strs){
            if(str.length() < minStr.length()){
                minStr = str;
            }
        }

        String minStrFinal = minStr;
        for(String str : strs){
            String minCompare = "";
            char[] chars = minStr.toCharArray();
            char[] strChars = str.toCharArray();
            int i = 0;
            for(char c : chars){
                if(c == strChars[i]){
                    minCompare = minCompare + c;
                }else{
                    break;
                }
                i++;
            }
            if(minStrFinal.length()>minCompare.length()){
                minStrFinal = minCompare;
            }
        }
        return minStrFinal;
    }
}
*/
