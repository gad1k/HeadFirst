package ch06_command.ex04_party;

public class PartyTestDrive {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light light = new Light("Living Room");
        TV tv = new TV("Living Room");
        Stereo stereo = new Stereo("Living Room");
        Hottub hottub = new Hottub();

        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);
        TVOnCommand TVOn = new TVOnCommand(tv);
        TVOffCommand TVOff = new TVOffCommand(tv);
        StereoOnCommand stereoOn = new StereoOnCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);
        HottubOnCommand hottubOn = new HottubOnCommand(hottub);
        HottubOffCommand hottubOff = new HottubOffCommand(hottub);

        Command[] partyOn = new Command[] {lightOn, TVOn, stereoOn, hottubOn};
        Command[] partyOff = new Command[] {lightOff, TVOff, stereoOff, hottubOff};

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        remoteControl.setCommand(0, partyOnMacro, partyOffMacro);

        System.out.println(remoteControl);
        System.out.println("---- Pushing Macro On ----");
        remoteControl.onButtonWasPushed(0);
        System.out.println("---- Pushing Macro Off ----");
        remoteControl.offButtonWasPushed(0);
    }
}
