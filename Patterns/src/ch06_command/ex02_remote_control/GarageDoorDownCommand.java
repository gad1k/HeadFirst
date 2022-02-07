package ch06_command.ex02_remote_control;

public class GarageDoorDownCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorDownCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.down();
    }
}
