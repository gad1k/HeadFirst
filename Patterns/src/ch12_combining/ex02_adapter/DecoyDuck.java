package ch12_combining.ex02_adapter;

public class DecoyDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("Silence");
    }
}
