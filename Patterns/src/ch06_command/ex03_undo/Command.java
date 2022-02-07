package ch06_command.ex03_undo;

public interface Command {
    void execute();
    void undo();
}
