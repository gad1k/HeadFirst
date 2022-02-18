package ch12_combining.ex03_decorator;

public class DecoyDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("Silence");
    }
}
