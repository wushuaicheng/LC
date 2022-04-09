package month_2;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.ArrayList;
import java.util.List;

public class LC220212 {
    /*private static String letterMap[] = {
            " ",    //0
            "",     //1
            "abc",  //2
            "def",  //3
            "ghi",  //4
            "jkl",  //5
            "mno",  //6
            "pqrs", //7
            "tuv",  //8
            "wxyz"  //9
    };
    private static ArrayList<String> res;
    public static List<String> letterCombinations(String digits) {

        res = new ArrayList<String>();
        if(digits.equals(""))
            return res;

        findCombination(digits, 0, "");
        return res;
    }

    private static void findCombination(String digits, int index, String s){

        if(index == digits.length()){
            res.add(s);
            return;
        }

        Character c = digits.charAt(index);
        String letters = letterMap[c+0];
        System.out.println(letters);
        for(int i = 0 ; i < letters.length() ; i ++){
            findCombination(digits, index+1, s + letters.charAt(i));
        }
        return;
    }

    public static void main(String[] args) {
        List<String> strings = letterCombinations("23");
        System.out.println(strings);
    }*/
    /*private String letterMap[]={
            " ",    //0
            "",     //1
            "abc",  //2
            "def",  //3
            "ghi",  //4
            "jkl",  //5
            "mno",  //6
            "pqrs", //7
            "tuv",  //8
            "wxyz"  //9
    };
    private List<String> res = new ArrayList<>();
    private List<String> letterCombinations(String digits){
        if(digits=="") return res;
        findCombination(digits,0,"");
        return res;
    }
    private void findCombination(String digits , int index , String s){
        if(index==digits.length()){
            res.add("");
            return;
        }
        char c = digits.charAt(index);
        String s1 = letterMap[c + 0];
        for(int i = 0 ; i<s1.length() ; i++){
            findCombination(digits,index++,s+s1.charAt(i));
        }

    }*/

/*
    private void findCombination(String digits, int index, StringBuilder sb) {

        if (index == digits.length()) {
            res.add(sb.toString());
            return;
        }

        char c = digits.charAt(index);
        String letters = letterMap[c - '0'];
        for (int i = 0; i < letters.length(); i++) {
            findCombination(digits, index + 1, sb.append(letters.charAt(i)));
            sb.deleteCharAt(sb.length()-1);
        }

    }*/
}
