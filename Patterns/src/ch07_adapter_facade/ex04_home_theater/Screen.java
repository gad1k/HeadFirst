package ch07_adapter_facade.ex04_home_theater;

public class Screen {
    String description;

    public Screen(String description) {
        this.description = description;
    }

    public void up() {
        System.out.println(description + " Going up");
    }

    public void down() {
        System.out.println(description + " Going down");
    }
}
