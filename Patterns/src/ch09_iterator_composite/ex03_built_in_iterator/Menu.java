package ch09_iterator_composite.ex03_built_in_iterator;

import java.util.Iterator;

public interface Menu {
    Iterator<MenuItem> createIterator();
}
