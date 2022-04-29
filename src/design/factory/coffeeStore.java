package design.factory;

public class coffeeStore {
    public CoffeeFactory coffeeFactory;

    public void setCoffeeFactory(CoffeeFactory coffeeFactory){
        this.coffeeFactory=coffeeFactory;
    }

    public coffee orderCoffee(){
        coffee coffee = coffeeFactory.creatCoffee();
        coffee.add();
        return coffee;
    }

}
