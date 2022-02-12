package ch09_iterator_composite.ex01_no_iterator;

import java.util.ArrayList;

public class Waitress {
    PancakeHouseMenu pancakeHouseMenu;
    DinerMenu dinerMenu;

    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    private void printMenuItem(MenuItem menuItem) {
        System.out.print(menuItem.getName() + ", ");
        System.out.print(menuItem.getPrice() + " -- ");
        System.out.println(menuItem.getDescription());
    }

    public void printMenu() {
        ArrayList<MenuItem> breakfastItems = pancakeHouseMenu.getMenuItems();
        MenuItem[] dinerItems = dinerMenu.getMenuItems();

        System.out.println("MENU");

        System.out.println("");
        System.out.println("Breakfast");
        for (MenuItem menuItem : breakfastItems)
            printMenuItem(menuItem);

        System.out.println("");
        System.out.println("Dinner");
        for (MenuItem menuItem : dinerItems)
            printMenuItem(menuItem);
    }
}
