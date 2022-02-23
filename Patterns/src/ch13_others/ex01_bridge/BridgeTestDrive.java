package ch13_others.ex01_bridge;

public class BridgeTestDrive {
    public static void main(String[] args) {
        TVFactory tvFactory = new TVFactory();

        GenericRemote remoteLG = new GenericRemote(tvFactory);
        System.out.println("Connect Your Remote to the TV");
        remoteLG.setTV("LG");
        remoteLG.on();
        remoteLG.nextChannel();
        remoteLG.prevChannel();
        remoteLG.off();

        SpecialRemote remoteSony = new SpecialRemote(tvFactory);
        System.out.println("Connect Your Remote to the TV");
        remoteSony.setTV("Sony");
        remoteSony.on();
        remoteSony.up();
        remoteSony.down();
        remoteSony.off();
    }
}
