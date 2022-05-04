package design.JDKdaili;

public class station implements sell{
    @Override
    public void sell() {
        System.out.println("火车站");
    }

    @Override
    public String get( int num) {
        return num+"";
    }
}
