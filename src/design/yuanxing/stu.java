package design.yuanxing;

public class stu implements Cloneable {
    public String name;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("私用");
        return super.clone();
    }
}
