package design.factory;

public abstract class coffee {
    public abstract void getName();

    public void add(){
        System.out.println("加");
        getName();
    }
}
