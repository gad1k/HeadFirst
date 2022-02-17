package ch11_proxy.ex01_gumball_monitor;

import java.util.Random;

public class HasQuarterState implements State {
    Random randomWinner = new Random(System.currentTimeMillis());
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
        int winner = randomWinner.nextInt(10);

        System.out.println("You Turned...");
        if (winner == 0 && gumballMachine.getCount() > 1)
            gumballMachine.setState(gumballMachine.getWinnerState());
        else
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
