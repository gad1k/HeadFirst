package ch11_proxy.ex02_gumball;

public class WinnerState implements State {
    private static final long serialVersionUID = 2L;
    transient GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
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
        if (gumballMachine.getCount() == 0) {
            gumballMachine.setState(gumballMachine.getSoldOutState());
        } else {
            gumballMachine.releaseBall();
            System.out.println("YOU'RE A WINNER! You Got Two Gumballs for Your Quarter");
            if (gumballMachine.getCount() > 0) {
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            } else {
                System.out.println("Oops, Out of Gumballs");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }
    }

    @Override
    public void refill() {
    }

    @Override
    public String toString() {
        return "Delivering Two Gumballs for Your Quarter Because YOU'RE A WINNER";
    }
}
