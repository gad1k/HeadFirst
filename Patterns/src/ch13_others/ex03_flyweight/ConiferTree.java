package ch13_others.ex03_flyweight;

public class ConiferTree implements Tree {
    @Override
    public void display(int x, int y) {
        System.out.println("Conifer Tree is Located at " + x + ", " + y);
    }
}
