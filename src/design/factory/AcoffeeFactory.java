package design.factory;

public class AcoffeeFactory implements CoffeeFactory{
    @Override
    public coffee creatCoffee() {
        return new Acoffee();
    }
}
