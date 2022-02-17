package ch11_proxy.ex01_gumball_monitor;

public class GumballMonitorTestDrive {
    public static void main(String[] args) {
        int count = 0;

        if (args.length < 2) {
            System.out.println("Gumball Machine <name> <inventory>");
            System.exit(1);
        }

        try {
            count = Integer.parseInt(args[1]);
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }

        GumballMachine gumballMachine = new GumballMachine(args[0], count);
        GumballMonitor gumballMonitor = new GumballMonitor(gumballMachine);

        gumballMonitor.report();
    }
}
