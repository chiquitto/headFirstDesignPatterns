package RemoteControl2.Receptors;

/**
 *
 * @author Alisson Chiquitto <chiquitto@gmail.com>
 */
public class CeilingFan {

    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    String name = "";
    private int speed;

    public CeilingFan(String name) {
        this.name = name;
        speed = OFF;
    }
    
    public void high() {
        speed = HIGH;
        System.out.println(this.name + ": Velocidade = " + getSpeed());
    }
    
    public void medium() {
        speed = MEDIUM;
        System.out.println(this.name + ": Velocidade = " + getSpeed());
    }
    
    public void low() {
        speed = LOW;
        System.out.println(this.name + ": Velocidade = " + getSpeed());
    }

    public void off() {
        speed = OFF;
        System.out.println(this.name + ": Velocidade = " + getSpeed());
    }

    /**
     * @return the speed
     */
    public int getSpeed() {
        return speed;
    }
}
