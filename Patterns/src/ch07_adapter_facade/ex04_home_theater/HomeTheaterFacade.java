package ch07_adapter_facade.ex04_home_theater;

public class HomeTheaterFacade {
    Amplifier amplifier;
    Tuner tuner;
    StreamingPlayer player;
    Projector projector;
    TheaterLights lights;
    Screen screen;
    PopcornPopper popper;

    public HomeTheaterFacade(Amplifier amplifier,
                             Tuner tuner,
                             StreamingPlayer player,
                             Projector projector,
                             TheaterLights lights,
                             Screen screen,
                             PopcornPopper popper) {
        this.amplifier = amplifier;
        this.tuner = tuner;
        this.player = player;
        this.projector = projector;
        this.lights = lights;
        this.screen = screen;
        this.popper = popper;
    }

    public void watchMovie(String movie) {
        System.out.println("Get Ready to Watch a Movie...");
        popper.on();
        popper.pop();
        lights.dim(10);
        tuner.on();
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amplifier.on();
        amplifier.setStreamingPlayer(player);
        amplifier.setSurroundSound();
        amplifier.setVolume(5);
        player.on();
        player.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting Movie Theater Down...");
        popper.off();
        lights.on();
        tuner.off();
        screen.up();
        projector.off();
        amplifier.off();
        player.stop();
        player.off();
    }
}
