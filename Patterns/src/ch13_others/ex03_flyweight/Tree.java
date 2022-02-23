package ch13_others.ex03_flyweight;

import java.time.LocalDate;
import java.time.Month;

public interface Tree {
    void display(int x, int y);

    default boolean isWithinRange(LocalDate date) {
        Month month = date.getMonth();
        return (month.getValue() > 2) && (month.getValue() < 11);
    }
}
