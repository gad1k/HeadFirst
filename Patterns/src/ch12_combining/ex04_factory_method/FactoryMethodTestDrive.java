package ch12_combining.ex04_factory_method;

public class FactoryMethodTestDrive {
    public static void main(String[] args) {
        AbstractDuckFactory duckFactory = new CountingDuckFactory();

        Quackable duckCall = duckFactory.createDuckCall();
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redHeadDuck = duckFactory.createRedHeadDuck();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());

        System.out.println("--- DUCK SIMULATOR with Factory Method ---");

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
