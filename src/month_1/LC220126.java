package month_1;

import java.util.ArrayList;

public class LC220126 {
    //Z型写字  注意flag的用法
    /*    class Solution {
        public String convert(String s, int numRows) {
            if(numRows < 2) return s;
            List<StringBuilder> rows = new ArrayList<StringBuilder>();
            for(int i = 0; i < numRows; i++) rows.add(new StringBuilder());
            int i = 0, flag = -1;
            for(char c : s.toCharArray()) {
                rows.get(i).append(c);
                if(i == 0 || i == numRows -1) flag = - flag;
                i += flag;
            }
            StringBuilder res = new StringBuilder();
            for(StringBuilder row : rows) res.append(row);
            return res.toString();
        }
    }*/
    public static void main(String[] args) {
        int numRows = 3;
        String s = "LEETCODE";
        ArrayList<StringBuilder> stringBuilders = new ArrayList<>();
        for (int i = 0; i < numRows; i++) stringBuilders.add(new StringBuilder());
        int i = 0;
        int flag = -1;
        for (char c : s.toCharArray()) {
            stringBuilders.get(i).append(c);
            if (i == 0 || i == numRows - 1) flag = -flag;
            i += flag;
        }
        StringBuilder res = new StringBuilder();
        for(StringBuilder row : stringBuilders) res.append(row);
        System.out.println(res);


    }


}
