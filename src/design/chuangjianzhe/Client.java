package design.chuangjianzhe;

public class Client {


    public static void main(String[] args) {
        phone build = new phone.Builder()
                .cpu("wsw")
                .memory("sws")
                .screen("csc").build();
        System.out.println(build);
    }


}
