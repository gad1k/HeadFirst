package ch06_command.ex02_remote_control;

public class Hottub {
    boolean on;
    int temperature;

    public Hottub() {
    }

    public void on() {
        on = true;
    }

    public void off() {
        on = false;
    }

    public void bubblesOn() {
        if (on)
            System.out.println("Hottub is Bubbling");
    }

    public void heat() {
        temperature = 105;
        System.out.println("Hottub is Heating to a Streaming 105 Degrees");
    }

    public void cool() {
        temperature = 98;
        System.out.println("Hottub is Cooling to 98 Degrees");
    }
}
