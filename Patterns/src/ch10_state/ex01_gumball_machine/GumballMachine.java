package ch10_state.ex01_gumball_machine;

public class GumballMachine {
    final static int SOLD_OUT = 0;
    final static int NO_QUARTER = 1;
    final static int HAS_QUARTER = 2;
    final static int SOLD = 3;

    int state = SOLD_OUT;
    int count = 0;

    public GumballMachine(int count) {
        this.count = count;
        if (count > 0)
            state = NO_QUARTER;
    }

    public void insertQuarter() {
        if (state == HAS_QUARTER) {
            System.out.println("You can't Insert Another Quarter");
        } else if (state == NO_QUARTER) {
            state = HAS_QUARTER;
            System.out.println("You Inserted a Quarter");
        } else if (state == SOLD_OUT) {
            System.out.println("You can't Insert a Quarter, the Machine is Sold out");
        } else if (state == SOLD) {
            System.out.println("Please Wait, We're Already Giving You a Gumball");
        }
    }

    public void ejectQuarter() {
        if (state == HAS_QUARTER) {
            System.out.println("Quarter Returned");
            state = NO_QUARTER;
        } else if (state == NO_QUARTER) {
            System.out.println("You haven't Inserted a Quarter");
        } else if (state == SOLD) {
            System.out.println("Sorry, You Already Turned the Crank");
        } else if (state == SOLD_OUT) {
            System.out.println("You can't Eject You haven't Inserted a Quarter Yet");
        }
    }

    public void turnCrank() {
        if (state == SOLD) {
            System.out.println("Turning Twice doesn't Get You Another Gumball");
        } else if (state == NO_QUARTER) {
            System.out.println("You Turned but There is No Quarter");
        } else if (state == SOLD_OUT) {
            System.out.println("You Turned but There are No Gumballs");
        } else if (state == HAS_QUARTER) {
            System.out.println("You Turned...");
            state = SOLD;
            dispense();
        }
    }

    private void dispense() {
        if (state == SOLD) {
            System.out.println("A Gumball Comes Rolling out the Slot");
            count--;
            if (count == 0) {
                System.out.println("Oops, Out of Gumballs");
                state = SOLD_OUT;
            } else {
                state = NO_QUARTER;
            }
        } else if (state == NO_QUARTER) {
            System.out.println("You Need to Pay First");
        } else if (state == SOLD_OUT) {
            System.out.println("No Gumball Dispensed");
        } else if (state == HAS_QUARTER) {
            System.out.println("No Gumball Dispensed");
        }
    }

    public void refill(int numGumballs) {
        count = numGumballs;
        state = NO_QUARTER;
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
        result.append("Machine is ");

        if (state == SOLD_OUT) {
            result.append("Sold out");
        } else if (state == NO_QUARTER) {
            result.append("Waiting for Quarter");
        } else if (state == HAS_QUARTER) {
            result.append("Waiting for Turn of Crank");
        } else if (state == SOLD) {
            result.append("Delivering a Gumball");
        }

        result.append("\n");

        return result.toString();
    }
}
