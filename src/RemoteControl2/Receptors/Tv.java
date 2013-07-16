package RemoteControl2.Receptors;

/**
 *
 * @author Alisson Chiquitto <chiquitto@gmail.com>
 */
public class Tv {
    
    String name = "";
    
    public Tv(String name) {
        this.name = name;
    }
    
    public void off() {
        System.out.println(this.name + ": Desligar tv");
    }

    public void on() {
        System.out.println(this.name + ": Ligar tv");
    }
}
