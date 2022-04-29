package design.danli;

public class test {
    public static void main(String[] args) {
        One one = One.getOne();
        One one1 = One.getOne();
        System.out.println(one1==one);
    }
}
