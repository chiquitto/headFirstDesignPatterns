package RemoteControl2.Receptors;

/**
 *
 * @author Alisson Chiquitto <chiquitto@gmail.com>
 */
public class Hottub {
    
    String name = "";
    
    public Hottub(String name) {
        this.name = name;
    }
    
    public void off() {
        System.out.println(this.name + ": Desligar ôfuro");
    }

    public void on() {
        System.out.println(this.name + ": Ligar ôfuro");
    }
}
