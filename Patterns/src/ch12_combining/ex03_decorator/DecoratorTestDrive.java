package ch12_combining.ex03_decorator;

public class DecoratorTestDrive {
    public static void main(String[] args) {
        Quackable duckCall = new QuackCounter(new DuckCall());
        Quackable mallardDuck = new QuackCounter(new MallardDuck());
        Quackable redHeadDuck = new QuackCounter(new RedHeadDuck());
        Quackable rubberDuck = new QuackCounter(new RubberDuck());
        Quackable gooseDuck = new GooseAdapter(new Goose());

        System.out.println("--- DUCK SIMULATOR with Decorator ---");
        simulate(duckCall);
        simulate(mallardDuck);
        simulate(redHeadDuck);
        simulate(rubberDuck);
        simulate(gooseDuck);

        System.out.println("The Ducks Quacked " + QuackCounter.getNumberOfQuacks() + " times");
    }

    static void simulate(Quackable duck) {
        duck.quack();
    }
}
