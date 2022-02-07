package ch06_command.ex05_simple_remote_control_wl;

public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() {
    }

    public void setCommand(Command command) {
        slot =  command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
