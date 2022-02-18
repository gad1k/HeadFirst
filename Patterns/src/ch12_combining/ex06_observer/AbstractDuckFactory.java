package ch12_combining.ex06_observer;

public abstract class AbstractDuckFactory {
    public abstract Quackable createDuckCall();
    public abstract Quackable createMallardDuck();
    public abstract Quackable createRedHeadDuck();
    public abstract Quackable createRubberDuck();
}
