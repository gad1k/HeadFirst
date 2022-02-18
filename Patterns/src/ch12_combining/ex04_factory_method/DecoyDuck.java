package ch12_combining.ex04_factory_method;

public class DecoyDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("Silence");
    }
}
