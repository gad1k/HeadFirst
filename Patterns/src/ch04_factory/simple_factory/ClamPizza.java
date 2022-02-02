package ch04_factory.simple_factory;

public class ClamPizza extends Pizza {
    public ClamPizza() {
        name = "Clam Pizza";
        dough = "Thin Crust";
        sauce = "White Garlic Sauce";
        toppings.add("Clams");
        toppings.add("Grated Parmesan Cheese");
    }
}
