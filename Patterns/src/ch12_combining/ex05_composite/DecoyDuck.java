package ch12_combining.ex05_composite;

public class DecoyDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("Silence");
    }
}
