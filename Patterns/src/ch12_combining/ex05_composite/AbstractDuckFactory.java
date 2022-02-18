package ch12_combining.ex05_composite;

public abstract class AbstractDuckFactory {
    public abstract Quackable createDuckCall();
    public abstract Quackable createMallardDuck();
    public abstract Quackable createRedHeadDuck();
    public abstract Quackable createRubberDuck();
}
