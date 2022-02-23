package ch13_others.ex01_bridge;

public class LG extends TV {
    int channel = 1;

    @Override
    public void on() {
        System.out.println("Tuning on the LG TV");
    }

    @Override
    public void off() {
        System.out.println("Tuning off the LG TV");
    }

    @Override
    public void tuneChannel(int channel) {
        this.channel = channel;
        System.out.println("Set the LG TV Channel to " + channel);
    }

    @Override
    public int getChannel() {
        return channel;
    }
}
