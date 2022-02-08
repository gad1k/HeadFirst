package ch07_adapter_facade.ex04_home_theater;

public class TheaterLights {
    String description;

    public TheaterLights(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println(description + " on");
    }

    public void dim(int level) {
        System.out.println(description + "Diming to " + level + "%");
    }
}
