package ch04_factory.ex02_factory_method;

public abstract class PizzaStore {
    abstract Pizza createPizza(String item);

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);

        System.out.println("---- Making a " + pizza.getName() + " ----");

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
