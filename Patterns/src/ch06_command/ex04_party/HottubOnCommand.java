package ch06_command.ex04_party;

public class HottubOnCommand implements Command {
    Hottub hottub;

    public HottubOnCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    @Override
    public void execute() {
        hottub.setTemperature(104);
        hottub.on();
    }

    @Override
    public void undo() {
        hottub.off();
    }
}
