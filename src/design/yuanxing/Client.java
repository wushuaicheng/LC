package design.yuanxing;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        stu ss = new stu();
        stu cc = (stu) ss.clone();
        System.out.println(ss.hashCode());
        System.out.println(cc.hashCode());
        System.out.println(ss==cc);
        System.out.println(ss.equals(cc));


    }
}
