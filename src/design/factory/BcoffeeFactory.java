package design.factory;

public class BcoffeeFactory implements CoffeeFactory{
    @Override
    public coffee creatCoffee() {
        return new Bcoffee();
    }
}
