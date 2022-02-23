package ch13_others.ex02_builder;

import java.util.List;

public class Pizza {
    String name;
    List<String> toppings;

    void addToppings(List<String> toppings) {
        this.toppings = toppings;
    }

    void prepare() {
        System.out.println("Prepare " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings: ");
        for (String topping : toppings)
            System.out.println("   " + topping);
    }

    void bake() {
        System.out.println("Bake for 25 Minutes at 350");
    }

    void cut() {
        System.out.println("Cut the Pizza into Diagonal slices");
    }

    void box() {
        System.out.println("Place Pizza in Official PizzaStore Box");
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuffer display = new StringBuffer();
        display.append("---- " + name + " ----").append("\n");
        for (String topping : toppings)
            display.append(topping + "\n");
        return display.toString();
    }
}
