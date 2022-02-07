package ch06_command.ex02_remote_control;

public class GarageDoor {
    String location;

    public GarageDoor(String location) {
        this.location = location;
    }

    public void up() {
        System.out.println(location + " Garage Door is Open");
    }

    public void down() {
        System.out.println(location + " Garage Door is Closed");
    }
}
