package design.danli;

public class One {
    private  One(){}

    /*private static class holdOne{
        private static final One one = new One();
    }

    public static One getOne(){
        return holdOne.one;
    }*/
    private static One one;
    public static One getOne(){
        if(one==null){
            synchronized (One.class){
                if(one==null) one=new One();
            }
        }
        return one;
    }
}
