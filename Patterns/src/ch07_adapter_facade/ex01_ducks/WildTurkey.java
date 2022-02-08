package ch07_adapter_facade.ex01_ducks;

public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm Flying a Short Distance");
    }
}
