package ch09_iterator_composite.ex02_hand_made_iterator;

public class DinerMenuIterator implements Iterator {
    MenuItem[] menuItems;
    int position = 0;

    public DinerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return menuItems.length > position;
    }

    @Override
    public MenuItem next() {
        return menuItems[position++];
    }
}
