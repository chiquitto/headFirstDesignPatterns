/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package RemoteControl.Receptors;

/**
 *
 * @author Alisson Chiquitto <chiquitto@gmail.com>
 */
public class CeilingFan {
    String name = "";

    public CeilingFan() {
    }
    
    public CeilingFan(String name) {
        this.name = name;
    }
    
    public void off() {
        System.out.println(this.name + ": Ligar ventilador");
    }

    public void on() {
        System.out.println(this.name + ": Desligar ventilador");
    }
}
