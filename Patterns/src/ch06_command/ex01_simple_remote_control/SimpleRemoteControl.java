package ch06_command.ex01_simple_remote_control;

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
