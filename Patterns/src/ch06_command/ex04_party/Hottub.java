package ch06_command.ex04_party;

public class Hottub {
    int temperature;

    public Hottub() {
    }

    public void on() {
        System.out.println("Hottub is heating, " + temperature + "%");
    }

    public void off() {
        System.out.println("Hottub is cooling, " + temperature + "%");
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
