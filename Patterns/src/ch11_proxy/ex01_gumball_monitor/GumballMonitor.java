package ch11_proxy.ex01_gumball_monitor;

public class GumballMonitor {
    GumballMachine gumballMachine;

    public GumballMonitor(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void report() {
        System.out.println("Gumball Machine: " + gumballMachine.getLocation());
        System.out.println("Current Inventory: " + gumballMachine.getCount() + " gumballs");
        System.out.println("Current State: " + gumballMachine.getState());
    }
}
