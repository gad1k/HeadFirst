package ch09_iterator_composite.ex02_hand_made_iterator;

import java.util.List;

public class PancakeHouseMenuIterator implements Iterator {
    List<MenuItem> menuItems;
    int position = 0;

    public PancakeHouseMenuIterator(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return menuItems.size() > position;
    }

    @Override
    public MenuItem next() {
        return menuItems.get(position++);
    }
}
