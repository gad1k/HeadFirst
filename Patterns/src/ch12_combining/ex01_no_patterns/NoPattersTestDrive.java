package ch12_combining.ex01_no_patterns;

public class NoPattersTestDrive {
    public static void main(String[] args) {
        Quackable decoyDuck = new DecoyDuck();
        Quackable duckCall = new DuckCall();
        Quackable mallardDuck = new MallardDuck();
        Quackable redHeadDuck = new RedHeadDuck();
        Quackable rubberDuck = new RubberDuck();

        System.out.println("--- DUCK SIMULATOR ---");
        simulate(decoyDuck);
        simulate(duckCall);
        simulate(mallardDuck);
        simulate(redHeadDuck);
        simulate(rubberDuck);
    }

    static void simulate(Quackable duck) {
        duck.quack();
    }
}
