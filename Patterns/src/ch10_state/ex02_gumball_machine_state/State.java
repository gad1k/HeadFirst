package ch10_state.ex02_gumball_machine_state;

public interface State {
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();

    void dispense();
    void refill();
}
