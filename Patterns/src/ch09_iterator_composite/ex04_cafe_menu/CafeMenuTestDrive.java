package ch09_iterator_composite.ex04_cafe_menu;

import java.util.ArrayList;

public class CafeMenuTestDrive {
    public static void main(String[] args) {
        ArrayList<Menu> menus = new ArrayList<Menu>();

        menus.add(new PancakeHouseMenu());
        menus.add(new DinerMenu());
        menus.add(new CafeMenu());

        Waitress waitress = new Waitress(menus);
        waitress.printMenu();
    }
}
