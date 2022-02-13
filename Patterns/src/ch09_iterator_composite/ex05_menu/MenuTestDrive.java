package ch09_iterator_composite.ex05_menu;

public class MenuTestDrive {
    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU","Breakfast");
        MenuComponent dinerMenu = new Menu("DINER MENU","Dinner");
        MenuComponent cafeMenu = new Menu("CAFE MENU","Supper");
        MenuComponent dessertMenu = new Menu("DESSERT MENU","Dessert");
        MenuComponent coffeeMenu = new Menu("COFFEE MENU","Stuff to Go with Your Afternoon Coffee");

        MenuComponent allMenus = new Menu("ALL MENUS","All menus combined");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        pancakeHouseMenu.add(new MenuItem("K&B's Pancake Breakfast","Pancakes with Scrambled Eggs and Toast",true,2.99));
        pancakeHouseMenu.add(new MenuItem("Regular Pancake Breakfast","Pancakes with Fried Eggs, Sausage",false,2.99));
        pancakeHouseMenu.add(new MenuItem("Blueberry Pancakes","Pancakes Made with Fresh Blueberries and Blueberry Syrup",true,3.49));
        pancakeHouseMenu.add(new MenuItem("Waffles","Waffles with Your Choice of Blueberries or Strawberries",true,3.59));

        dinerMenu.add(new MenuItem("Vegetarian BLT","(Fakin') Bacon with Lettuce & Tomato on Whole Wheat",true,2.99));
        dinerMenu.add(new MenuItem("BLT","Bacon with Lettuce & Tomato on Whole Wheat",false,2.99));
        dinerMenu.add(new MenuItem("Soup of the Day","Soup of the Day, with a Side of Potato Salad",false,3.29));
        dinerMenu.add(new MenuItem("Hotdog","A Hot Dog, with Saurkraut, Relish, Onions, Topped with Cheese",false,3.05));
        dinerMenu.add(new MenuItem("Steamed Veggies and Brown Rice","Steamed Vegetables over Brown Rice",true,3.99));
        dinerMenu.add(new MenuItem("Pasta","Spaghetti with Marinara Sauce and a Slice of Sourdough Bread",true,3.89));
        dinerMenu.add(dessertMenu);

        dessertMenu.add(new MenuItem("Apple Pie","Apple Pie with a Flakey Crust Topped with Vanilla Icecream",true,1.59));
        dessertMenu.add(new MenuItem("Cheesecake","Creamy New York Cheesecake With a Chocolate Graham Crust",true,1.99));
        dessertMenu.add(new MenuItem("Sorbet","A Scoop of Raspberry and a Scoop of Lime",true,1.89));

        cafeMenu.add(new MenuItem("Veggie Burger and Air Fries","Veggie Burger on a Whole Wheat Bun, Lettuce, Tomato and Fries",true,3.99));
        cafeMenu.add(new MenuItem("Soup of the Day","A Cup of the Soup of the Day with a Side Salad",false,3.69));
        cafeMenu.add(new MenuItem("Burrito","A Large Burrito with Whole Pinto Beans, Salsa, Guacamole",true,4.29));
        cafeMenu.add(coffeeMenu);

        coffeeMenu.add(new MenuItem("Coffee Cake","Crumbly Cake Topped with Cinnamon and Walnuts",true,1.59));
        coffeeMenu.add(new MenuItem("Bagel","Flavors Include Sesame, Poppyseed, Cinnamon Raisin, Pumpkin",false,0.69));
        coffeeMenu.add(new MenuItem("Biscotti","Three Almond or Hazelnut Biscotti Cookies",true,0.89));

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
    }
}
