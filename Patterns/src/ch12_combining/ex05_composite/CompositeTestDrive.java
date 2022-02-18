package ch12_combining.ex05_composite;

public class CompositeTestDrive {
    public static void main(String[] args) {
        AbstractDuckFactory duckFactory = new CountingDuckFactory();

        System.out.println("--- DUCK SIMULATOR with Composite ---");

        Flock flockOfDucks = new Flock();

        Quackable duckCall = duckFactory.createDuckCall();
        Quackable redHeadDuck = duckFactory.createRedHeadDuck();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());

        flockOfDucks.add(duckCall);
        flockOfDucks.add(redHeadDuck);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseDuck);

        Flock flockOfMallardDucks = new Flock();

        Quackable mallardOne = duckFactory.createMallardDuck();
        Quackable mallardTwo = duckFactory.createMallardDuck();
        Quackable mallardThree = duckFactory.createMallardDuck();
        Quackable mallardFour = duckFactory.createMallardDuck();

        flockOfMallardDucks.add(mallardOne);
        flockOfMallardDucks.add(mallardTwo);
        flockOfMallardDucks.add(mallardThree);
        flockOfMallardDucks.add(mallardFour);

        flockOfDucks.add(flockOfMallardDucks);

        System.out.println("----- Whole Flock -----");
        simulate(flockOfDucks);

        System.out.println("----- Mallard Flock -----");
        simulate(flockOfMallardDucks);

        System.out.println("The Ducks Quacked " + QuackCounter.getNumberOfQuacks() + " times");
    }

    static void simulate(Quackable duck) {
        duck.quack();
    }
}
