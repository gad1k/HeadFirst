package ch06_command.ex02_remote_control;

public class HottubOffCommand implements Command {
    Hottub hottub;

    public HottubOffCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    @Override
    public void execute() {
        hottub.cool();
        hottub.off();
    }
}
