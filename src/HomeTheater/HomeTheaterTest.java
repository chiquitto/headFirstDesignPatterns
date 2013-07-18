package HomeTheater;

/**
 *
 * @author Alisson Chiquitto <chiquitto@gmail.com>
 */
public class HomeTheaterTest {

    public static void main(String[] args) {
        Amplifier amplifier = new Amplifier();
        Tuner tuner = new Tuner();
        DvdPlayer dvdPlayer = new DvdPlayer();
        CdPlayer cdPlayer = new CdPlayer();
        Projector projector = new Projector();
        Screen screen = new Screen();
        TheaterLights theaterLights = new TheaterLights();
        PopcornPopper popcornPopper = new PopcornPopper();

        HomeTheaterFacade homeTheaterFacade =
                new HomeTheaterFacade(amplifier,
                tuner,
                dvdPlayer,
                cdPlayer,
                projector,
                theaterLights,
                screen,
                popcornPopper);
        
        homeTheaterFacade.watchMovie("Homens de preto");
        homeTheaterFacade.endMovie();
    }
}
