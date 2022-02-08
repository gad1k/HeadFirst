package ch07_adapter_facade.ex01_ducks;

public class DucksTestDrive {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        Turkey duckAdapter = new DuckAdapter(duck);

        System.out.println("The Turkey Says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("");
        System.out.println("The Duck Says...");
        testDuck(duck);

        System.out.println("");
        System.out.println("The TurkeyAdapter Says...");
        testDuck(turkeyAdapter);

        System.out.println("");
        System.out.println("The DuckAdapter Says...");
        for (int i = 0; i < 5; i++) {
            duckAdapter.gobble();
            duckAdapter.fly();
        }
    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
