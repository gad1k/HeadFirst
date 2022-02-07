package ch06_command.ex05_simple_remote_control_wl;

public class SimpleRemoteControlWLTestDrive {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();

        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();

        remote.setCommand(light::on);
        remote.buttonWasPressed();
        remote.setCommand(garageDoor::up);
        remote.buttonWasPressed();
        remote.setCommand(garageDoor::lightOn);
        remote.buttonWasPressed();
        remote.setCommand(garageDoor::lightOff);
        remote.buttonWasPressed();
    }
}
