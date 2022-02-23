package ch13_others.ex03_flyweight;

import java.time.LocalDate;

public class DeciduousTree implements Tree {
    @Override
    public void display(int x, int y) {
        System.out.println("Deciduous Tree is Located at " + x + ", " + y);
        if (!isWithinRange(LocalDate.now()))
            System.out.println("The tree currently Has No Leaves");
    }
}
