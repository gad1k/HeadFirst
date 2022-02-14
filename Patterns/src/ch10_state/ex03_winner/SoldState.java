package ch10_state.ex03_winner;

public class SoldState implements State {
    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please Wait, We're Already Giving You a Gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry, You Already Turned the Crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turning Twice doesn't Get You Another Gumball");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0) {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        } else {
            System.out.println("Oops, Out of Gumballs");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }

    @Override
    public void refill() {}

    @Override
    public String toString() {
        return "Delivering a Gumball";
    }
}
