package ch10_state.ex03_winner;

public class SoldOutState implements State {
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't Insert a Quarter, the Machine is Sold out");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You can't Eject You haven't Inserted a Quarter Yet");
    }

    @Override
    public void turnCrank() {
        System.out.println("You Turned but There are No Gumballs");
    }

    @Override
    public void dispense() {
        System.out.println("No Gumball Dispensed");
    }

    @Override
    public void refill() {
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public String toString() {
        return "Sold out";
    }
}
