package month_1;
//12321 是否是这样
public class LC220128 {
    public static void main(String[] args) {
        int x = 100;
        if(x<0||(x%10==0&&x!=0)){
           // return flase;
    }
        int y = 0;
        if(x>y){
            y=y*10+x%10;
            x=x/10;
        }
        //return x==y||x==y%10

        }
}
