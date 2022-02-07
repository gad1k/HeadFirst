package ch04_factory.ex01_simple_factory;

public class PizzaTestDrive {
    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(factory);
        Pizza pizza;

        pizza = store.orderPizza("cheese");
        System.out.println("We ordered a " + pizza.getName());
        System.out.println(pizza);

        pizza = store.orderPizza("veggie");
        System.out.println("We ordered a " + pizza.getName());
        System.out.println(pizza);
    }
}
