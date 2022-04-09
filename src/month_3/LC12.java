package month_3;

public class LC12 {
    //844. 比较含退格的字符串
    public static boolean   backspaceCompare(String S, String T){
        int s = S.length()-1;
        int t = T.length()-1;
        int sskip = 0 ;
        int tskip = 0 ;
        while(s>=0||t>=0){
            while(s>=0){
                if(S.charAt(s)=='#'){
                    sskip++;
                    s--;
                }else if(sskip!=0){
                    sskip--;
                    s--;
                }else break;;
            }
            while (t>=0) {
                if (T.charAt(t) == '#') {
                    tskip++;
                    t--;
                } else if (tskip != 0) {
                    tskip--;
                    t--;
                } else break;
            }
            if(s>=0&&t>=0){
                if(S.charAt(s)!=T.charAt(t)) return false;
            }else if(s>=0||t>=0) return false;
            s--;
            t--;
        }
        return true;
    }

    public static void main(String[] args) {
        backspaceCompare("ab#c","ad#c");
    }


}
