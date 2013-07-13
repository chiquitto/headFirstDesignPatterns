package RemoteControl.Receptors;

/**
 *
 * @author Alisson Chiquitto <chiquitto@gmail.com>
 */
public class Light {
    
    String name = "";

    public Light() {
    }
    
    public Light(String name) {
        this.name = name;
    }
    
    public void off() {
        System.out.println(this.name + ": Apagar a luz");
    }

    public void on() {
        System.out.println(this.name + ": Acendeu a luz");
    }
}
