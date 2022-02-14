package ch10_state.ex03_winner;

public interface State {
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();

    void dispense();
    void refill();
}
