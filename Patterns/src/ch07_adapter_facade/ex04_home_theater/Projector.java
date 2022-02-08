package ch07_adapter_facade.ex04_home_theater;

public class Projector {
    String description;

    public Projector(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println(description + " on");
    }

    public void off() {
        System.out.println(description + " off");
    }

    public void wideScreenMode() {
        System.out.println(description + " in Widescreen Mode (16x9 Aspect Ratio)");
    }
}
