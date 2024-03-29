package ch04_factory.ex02_factory_method;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String item) {
        if (item.equals("cheese"))
            return new ChicagoStyleCheesePizza();
        else if (item.equals("pepperoni"))
            return new ChicagoStylePepperoniPizza();
        else if (item.equals("clam"))
            return new ChicagoStyleClamPizza();
        else if (item.equals("veggie"))
            return new ChicagoStyleVeggiePizza();
        else
            return null;
    }
}
