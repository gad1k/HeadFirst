package ch10_state.ex02_gumball_machine_state;

public class HasQuarterState implements State {
    GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't Insert Another Quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter Returned");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("You Turned...");
        gumballMachine.setState(gumballMachine.getSoldState());
    }

    @Override
    public void dispense() {
        System.out.println("No Gumball Dispensed");
    }

    @Override
    public void refill() {}

    @Override
    public String toString() {
        return "Waiting for Turn of Crank";
    }
}
