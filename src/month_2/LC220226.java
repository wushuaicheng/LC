package month_2;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class LC220226 {
    public static boolean isValid(String s) {
        if(s=="") return true;
        Deque<Character> deque = new LinkedList<>();
        char ch;
        for(int i = 0; i<s.length() ; i++){
            ch = s.charAt(i);
            if(ch == '('){
                deque.push(')');
            }else if(ch == '['){
                deque.push(']');
            }else if(ch=='{'){
                deque.push('}');
            }else if (deque.isEmpty()||ch!=deque.pop()){
                return false;
            }
        }
        if(deque.isEmpty())
            return true;
        return false;

    }

    public static void main(String[] args) {
        boolean valid = isValid("()[]");
        System.out.println(valid);
    }
}
