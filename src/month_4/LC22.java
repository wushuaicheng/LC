package month_4;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//779. 第K个语法符号
public class LC22 {

    public int kthGrammar(int n, int k) {
        if(n==1){
            return 0;
        }
        int length = (int)Math.pow(2,n-1);
        if(k>length/2){
            int res = kthGrammar(n-1,k-length/2);
            return res==1?0:1;
        }else {
            return kthGrammar(n-1,k);
        }



    }
}
