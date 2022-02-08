package ch07_adapter_facade.ex04_home_theater;

public class Amplifier {
    String description;

    public Amplifier(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println(description + " on");
    }

    public void off() {
        System.out.println(description + " off");
    }

    public void setStreamingPlayer(StreamingPlayer player) {
        System.out.println(description + " Setting Streaming Player to " + player);
    }

    public void setSurroundSound() {
        System.out.println(description + "Surround Sound on (5 Speakers, 1 Subwoofer)");
    }

    public void setVolume(int level) {
        System.out.println(description + " Setting Volume to " + level);
    }
}
