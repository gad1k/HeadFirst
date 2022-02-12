package ch09_iterator_composite.ex02_hand_made_iterator;

import java.util.ArrayList;

public class PancakeHouseMenu {
    ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<MenuItem>();

        addItem("K&B's Pancake Breakfast", "Pancakes with Scrambled Eggs and Toast", true, 2.99);
        addItem("Regular Pancake Breakfast", "Pancakes with Fried Eggs, Sausage", false, 2.99);
        addItem("Blueberry Pancakes", "Pancakes Made with Fresh Blueberries and Blueberry Syrup", true, 3.49);
        addItem("Waffles", "Waffles with Your Choice of Blueberries or Strawberries", true, 3.59);
    }

    public void addItem(String name, String description, boolean vegatarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegatarian, price);
        menuItems.add(menuItem);
    }

    public Iterator createIterator() {
        return new PancakeHouseMenuIterator(menuItems);
    }
}
