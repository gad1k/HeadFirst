package ch13_others.ex01_bridge;

public class Sony extends TV {
    int station = 0;

    @Override
    public void on() {
        System.out.println("Tuning on the Sony TV");
    }

    @Override
    public void off() {
        System.out.println("Tuning off the Sony TV");
    }

    @Override
    public void tuneChannel(int channel) {
        station = channel;
        System.out.println("Set the Sony TV Channel to " + channel);
    }

    @Override
    public int getChannel() {
        return station;
    }
}
