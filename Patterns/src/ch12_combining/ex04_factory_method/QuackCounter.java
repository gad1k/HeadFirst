package ch12_combining.ex04_factory_method;

public class QuackCounter implements Quackable {
    static int numberOfQuacks;
    Quackable duck;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        numberOfQuacks++;
    }

    public static int getNumberOfQuacks() {
        return numberOfQuacks;
    }
}
