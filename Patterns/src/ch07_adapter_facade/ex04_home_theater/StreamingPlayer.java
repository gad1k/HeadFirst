package ch07_adapter_facade.ex04_home_theater;

public class StreamingPlayer {
    String description;
    String movie;

    public StreamingPlayer(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println(description + " on");
    }

    public void off() {
        System.out.println(description + " off");
    }

    public void play(String movie) {
        this.movie = movie;
        System.out.println(description + " playing \"" + movie + "\"");
    }

    public void stop() {
        System.out.println(description + " Stopped \"" + movie + "\"");
    }

    @Override
    public String toString() {
        return description;
    }
}
