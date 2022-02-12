package ch09_iterator_composite.ex03_built_in_iterator;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator<MenuItem> {
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

    @Override
    public void remove() {
        if (position <= 0)
            throw new IllegalStateException("You Can't Remove an Item until You've Done at Least One next()");

        if (menuItems[position - 1] != null) {
            for (int i = position - 1; i < menuItems.length - 1; i++)
                menuItems[i] = menuItems[i + 1];
            menuItems[menuItems.length - 1] = null;
        }
    }
}
