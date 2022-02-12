package ch09_iterator_composite.ex04_cafe_menu;

import java.util.HashMap;
import java.util.Iterator;

public class CafeMenu implements Menu {
    HashMap<String, MenuItem> menuItems;

    public CafeMenu() {
        menuItems = new HashMap<String, MenuItem>();

        addItem("Veggie Burger and Air Fries", "Veggie Burger on a Whole Wheat Bun, Lettuce, Tomato and Fries", true, 3.99);
        addItem("Soup of the Day", "A Cup of the Soup of the Day with a Side Salad", false, 3.69);
        addItem("Burrito", "A Large Burrito with Whole Pinto Beans, Salsa, Guacamole", true, 4.29);
    }

    public void addItem(String name, String description, boolean vegatarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegatarian, price);
        menuItems.put(name, menuItem);
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return menuItems.values().iterator();
    }
}
