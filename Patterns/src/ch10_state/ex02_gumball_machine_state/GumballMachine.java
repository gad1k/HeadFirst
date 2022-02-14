package ch10_state.ex02_gumball_machine_state;

public class GumballMachine {
    State hasQuarterState;
    State noQuarterState;
    State soldOutState;
    State soldState;

    State state;
    int count = 0;

    public GumballMachine(int count) {
        hasQuarterState = new HasQuarterState(this);
        noQuarterState = new NoQuarterState(this);
        soldOutState = new SoldOutState(this);
        soldState = new SoldState(this);

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

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
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
        if (count > 0 )
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
