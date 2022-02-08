package ch07_adapter_facade.ex04_home_theater;

public class HomeTheaterTestDrive {
    public static void main(String[] args) {
        Amplifier amplifier = new Amplifier("Amplifier");
        Tuner tuner = new Tuner("Tuner");
        StreamingPlayer player = new StreamingPlayer("Streaming Player");
        Projector projector = new Projector("Projector");
        TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
        Screen screen = new Screen("Theater Screen");
        PopcornPopper popper = new PopcornPopper("Popcorn Popper");

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amplifier, tuner, player, projector, lights, screen, popper);

        homeTheater.watchMovie("Mortal Combat");
        homeTheater.endMovie();
    }
}
