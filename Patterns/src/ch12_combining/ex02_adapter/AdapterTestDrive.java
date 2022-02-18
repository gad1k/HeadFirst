package ch12_combining.ex02_adapter;

public class AdapterTestDrive {
    public static void main(String[] args) {
        Quackable decoyDuck = new DecoyDuck();
        Quackable duckCall = new DuckCall();
        Quackable mallardDuck = new MallardDuck();
        Quackable redHeadDuck = new RedHeadDuck();
        Quackable rubberDuck = new RubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());

        System.out.println("--- DUCK SIMULATOR with Adapter ---");
        simulate(decoyDuck);
        simulate(duckCall);
        simulate(mallardDuck);
        simulate(redHeadDuck);
        simulate(rubberDuck);
        simulate(gooseDuck);
    }

    static void simulate(Quackable duck) {
        duck.quack();
    }
}
