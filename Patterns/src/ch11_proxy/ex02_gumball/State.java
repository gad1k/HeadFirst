package ch11_proxy.ex02_gumball;

import java.io.Serializable;

public interface State extends Serializable {
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();

    void dispense();
    void refill();
}
