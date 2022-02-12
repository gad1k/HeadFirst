package ch09_iterator_composite.ex04_cafe_menu;

public class MenuItem {
    String name;
    String description;
    boolean vegatarian;
    double price;

    public MenuItem(String name, String description, boolean vegatarian, double price) {
        this.name = name;
        this.description = description;
        this.vegatarian = vegatarian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isVegatarian() {
        return vegatarian;
    }

    public double getPrice() {
        return price;
    }
}
