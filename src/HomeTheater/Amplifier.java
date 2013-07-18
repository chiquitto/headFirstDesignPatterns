package HomeTheater;

/**
 *
 * @author Alisson Chiquitto <chiquitto@gmail.com>
 */
public class Amplifier {
    
    DvdPlayer dvdPlayer;

    void on() {
        System.out.println("Ligar amplificador");
    }

    void setDvd(DvdPlayer dvdPlayer) {
        this.dvdPlayer = dvdPlayer;
        System.out.println("Ligar com o Aparelho de DVD");
    }

    void setSurroundSound() {
        System.out.println("Colocar no Som Surround");
    }

    void setVolume(int i) {
        System.out.println("Colocar no volume" + i);
    }

    void off() {
        System.out.println("Desligar amplificador");
    }
    
}
