package ch11_proxy.ex02_gumball;

public class NoQuarterState implements State {
    private static final long serialVersionUID = 2L;
    transient GumballMachine gumballMachine;

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
