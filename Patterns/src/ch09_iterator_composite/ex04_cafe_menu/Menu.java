package ch09_iterator_composite.ex04_cafe_menu;

import java.util.Iterator;

public interface Menu {
    Iterator<MenuItem> createIterator();
}
