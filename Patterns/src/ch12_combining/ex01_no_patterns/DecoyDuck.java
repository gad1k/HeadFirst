package ch12_combining.ex01_no_patterns;

public class DecoyDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("Silence");
    }
}
