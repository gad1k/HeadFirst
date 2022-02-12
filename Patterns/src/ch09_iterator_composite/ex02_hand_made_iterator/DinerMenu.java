package ch09_iterator_composite.ex02_hand_made_iterator;

public class DinerMenu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("Vegetarian BLT", "(Fakin') Bacon with Lettuce & Tomato on Whole Wheat", true, 2.99);
        addItem("BLT", "Bacon with Lettuce & Tomato on Whole Wheat", false, 2.99);
        addItem("Soup of the Day", "Soup of the Day, with a Side of Potato Salad", false, 3.29);
        addItem("Hotdog", "A Hot Dog, with Saurkraut, Relish, Onions, Topped with Cheese", false, 3.05);
        addItem("Steamed Veggies and Brown Rice", "Steamed Vegetables over Brown Rice", true, 3.99);
        addItem("Pasta", "Spaghetti with Marinara Sauce, and a Slice of Sourdough Bread", true, 3.89);
    }

    public void addItem(String name, String description, boolean vegatarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegatarian, price);

        if (numberOfItems >= MAX_ITEMS)
            System.err.println("Sorry, Menu is Full! Can't Add item to Menu");
        else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems++;
        }
    }

    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
