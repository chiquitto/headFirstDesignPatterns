package RemoteControl.Receptors;

/**
 *
 * @author Alisson Chiquitto <chiquitto@gmail.com>
 */
public class Stereo {

    String name = "";

    public Stereo() {
    }

    public Stereo(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(this.name + ": Ligar aparelho de som");
    }

    public void off() {
        System.out.println(this.name + ": Desligar aparelho de som");
    }

    public void setCd() {
        System.out.println(this.name + ": Tocar CD");
    }

    public void setDvd() {
        System.out.println(this.name + ": Tocar DVD");
    }

    public void setRadio() {
        System.out.println(this.name + ": Tocar Radio");
    }

    public void setVolume(int volume) {
        System.out.println(this.name + ": Alterar volume para " + volume);
    }
}
