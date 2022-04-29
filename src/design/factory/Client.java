package design.factory;

public class Client {
    public static void main(String[] args) {
        BcoffeeFactory bcoffeeFactory = new BcoffeeFactory();
        coffeeStore coffeeStore = new coffeeStore();
        coffeeStore.setCoffeeFactory(bcoffeeFactory);
        coffeeStore.orderCoffee();
    }
}
