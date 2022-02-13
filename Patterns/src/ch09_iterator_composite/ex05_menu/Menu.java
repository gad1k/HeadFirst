package ch09_iterator_composite.ex05_menu;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent {
    String name;
    String description;
    ArrayList<MenuComponent> menuComponents;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
        menuComponents = new ArrayList<MenuComponent>();
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void print() {
        System.out.println("");
        System.out.println(getName() + ", " + getDescription());
        System.out.println("---------------------------------");

        Iterator<MenuComponent> iterator = menuComponents.iterator();
        while (iterator.hasNext()) {
            MenuComponent menuComponent = iterator.next();
            menuComponent.print();
        }
    }
}
