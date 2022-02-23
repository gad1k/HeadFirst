package ch13_others.ex01_bridge;

public class SpecialRemote extends RemoteControl {
    public SpecialRemote(TVFactory tvFactory) {
        super(tvFactory);
    }

    public void up() {
        int channel = getChannel();
        setChannel(channel + 1);
    }

    public void down() {
        int channel = getChannel();
        setChannel(channel - 1);
    }
}
