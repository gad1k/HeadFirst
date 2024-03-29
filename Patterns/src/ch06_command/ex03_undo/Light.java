package ch06_command.ex03_undo;

public class Light {
    String location;
    int level;

    public Light(String location) {
        this.location = location;
    }

    public void on() {
        level = 100;
        System.out.println(location + " Light is on");
    }

    public void off() {
        level = 0;
        System.out.println(location + " Light is off");
    }

    public void dim(int level) {
        this.level = level;
        if (level == 0)
            off();
        else
            System.out.println("Light is Dimmed to " + level + "%");
    }

    public int getLevel() {
        return level;
    }
}
