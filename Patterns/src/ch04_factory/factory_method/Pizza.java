package ch04_factory.factory_method;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    List<String> toppings = new ArrayList<String>();

    public String getName() {
        return name;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings:");
        for (String topping : toppings)
            System.out.println("   " + topping);
    }

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cut the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    @Override
    public String toString() {
        StringBuffer display = new StringBuffer();
        
        display.append("---- " + name + " ----" + "\n");
        display.append(dough + "\n");
        display.append(sauce + "\n");

        for (String topping : toppings)
            display.append(topping + "\n");

        return display.toString();
    }
}
