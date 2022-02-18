package ch12_combining.ex05_composite;

public class DuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createDuckCall() {
        return new DecoyDuck();
    }

    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createRedHeadDuck() {
        return new RedHeadDuck();
    }

    @Override
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }
}
