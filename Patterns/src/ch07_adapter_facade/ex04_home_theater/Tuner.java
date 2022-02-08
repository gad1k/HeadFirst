package ch07_adapter_facade.ex04_home_theater;

public class Tuner {
    String description;

    public Tuner(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println(description + " on");
    }

    public void off() {
        System.out.println(description + " off");
    }
}
