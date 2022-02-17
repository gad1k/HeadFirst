package ch11_proxy.ex01_gumball_monitor;

public interface State {
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();

    void dispense();
    void refill();
}
