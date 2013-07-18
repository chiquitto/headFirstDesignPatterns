package HomeTheater;

/**
 *
 * @author Alisson Chiquitto <chiquitto@gmail.com>
 */
public class DvdPlayer {

    public DvdPlayer() {
    }

    void on() {
        System.out.println("Ligar DVD");
    }

    void play(String movie) {
        System.out.println("Tocar DVD " + movie);
    }

    void stop() {
        System.out.println("Parar filme do DVD");
    }

    void eject() {
        System.out.println("Ejetar midia do DVD");
    }

    void off() {
        System.out.println("Desligar aparelho de DVD");
    }
}
