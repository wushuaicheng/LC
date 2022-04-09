package month_1;

import jdk.swing.interop.SwingInterOpUtils;
import org.w3c.dom.ls.LSOutput;

public class LC220122 {
    public static void main(String[] args) {

        String s = "PPALALP";
        int length = s.length();
        int A = 0;
        int L = 0;

        for(int i = 0 ; i<length ; i++){
            if(s.charAt(i) =='A'){
                A++;
                L=0;
            }else if(s.charAt(i)=='L'){
                L++;
            }else{
                L=0;
            }
            if(A>=2||L>=3){
                System.out.println("NO");
               //// return false
            }
        }
        System.out.println("yes");
       // return true

    }
}
