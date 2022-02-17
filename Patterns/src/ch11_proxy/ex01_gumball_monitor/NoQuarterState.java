package ch11_proxy.ex01_gumball_monitor;

public class NoQuarterState implements State {
    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You Inserted a Quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You haven't Inserted a Quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("You Turned but There is No Quarter");
    }

    @Override
    public void dispense() {
        System.out.println("You Need to Pay First");
    }

    @Override
    public void refill() {}

    @Override
    public String toString() {
        return "Waiting for Quarter";
    }
}
