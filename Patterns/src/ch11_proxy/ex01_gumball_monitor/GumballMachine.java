package ch11_proxy.ex01_gumball_monitor;

public class GumballMachine {
    State hasQuarterState;
    State noQuarterState;
    State soldOutState;
    State soldState;
    State winnerState;

    int count;
    String location;
    State state;

    public GumballMachine(String location, int count) {
        hasQuarterState = new HasQuarterState(this);
        noQuarterState = new NoQuarterState(this);
        soldOutState = new SoldOutState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);

        this.location = location;
        this.count = count;
        if (count > 0)
            state = noQuarterState;
        else
            state = soldOutState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public String getLocation() {
        return location;
    }

    public int getCount() {
        return count;
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public void releaseBall() {
        System.out.println("A Gumball Comes Rolling out the Slot");
        if (count > 0)
            count--;
    }

    public void refill(int numGumballs) {
        count += numGumballs;
        System.out.println("The Gumball Machine was Just Refilled; Its New Count is: " + count);
        state.refill();
    }

    @Override
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\n");
        result.append("Mighty Gumball, Inc.");
        result.append("\n");
        result.append("Java-enabled Standing Gumball Model #2004");
        result.append("\n");
        result.append("Inventory: " + count + " gumball");

        if (count != 1) {
            result.append("s");
        }

        result.append("\n");
        result.append("Machine is " + count + "\n");

        return result.toString();
    }
}
