package design.chuangjianzhe;

public class phone {
    private String screen;
    private String memory;
    private String cpu;

    @Override
    public String toString() {
        return "phone{" +
                "screen='" + screen + '\'' +
                ", memory='" + memory + '\'' +
                ", cpu='" + cpu + '\'' +
                '}';
    }

    private phone(Builder builder){
        this.screen=builder.screen;
        this.memory=builder.memory;
        this.cpu=builder.cpu;
    }
    public static final class Builder{
        private String screen;
        private String memory;
        private String cpu;

        public Builder screen(String screen){
            this.screen=screen;
            return this;
        }
        public Builder memory(String memory){
            this.memory=memory;
            return this;
        }
        public Builder cpu(String cpu){
            this.cpu=cpu;
            return this;
        }
        public phone build(){
            return new phone(this);
        }
    }
}
