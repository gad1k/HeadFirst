package ch06_command.ex02_remote_control;

public class Stereo {
    String location;

    public Stereo(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " Stereo is on");
    }

    public void off() {
        System.out.println(location + " Stereo is off");
    }

    public void setCD() {
        System.out.println(location + " Stereo is Set for CD Input");
    }

    public void setVolume(int volume) {
        System.out.println(location + " Stereo Volume Set to " + volume);
    }
}
