package month_6;


//汉诺塔问题
public class LC06 {
    public static void hannuota(int i , char a, char b , char c){
        if(i==1){
            System.out.println("将"+a+"移动到"+c);
            return;
        }
        hannuota(i-1,a,c,b);
        System.out.println("将"+a+"移动到"+c);
        hannuota(i-1,b,a,c);
    }

    public static void main(String[] args) {
        hannuota(3,'a','b','c');
    }
}
