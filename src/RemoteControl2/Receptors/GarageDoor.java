package RemoteControl2.Receptors;

/**
 *
 * @author Alisson Chiquitto <chiquitto@gmail.com>
 */
public class GarageDoor {
    
    String name = "";

    public GarageDoor() {
    }
    
    public GarageDoor(String name) {
        this.name = name;
    }
    public void up() {
        System.out.println(this.name + ": Subir porta da Garagem");
    }
    
    public void down() {
        System.out.println(this.name + ": Descer porta da Garagem");
    }
    
    public void stop() {
        System.out.println(this.name + ": Parar porta da Garagem");
    }
    
    public void lightOn() {
        System.out.println(this.name + ": Acender luz da garagem");
    }
    
    public void lightOff() {
        System.out.println(this.name + ": Apagar luz da garagem");
    }
}
