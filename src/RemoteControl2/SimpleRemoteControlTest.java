package RemoteControl2;

import RemoteControl2.Commands.*;
import RemoteControl2.Receptors.*;

/**
 *
 * @author Alisson Chiquitto <chiquitto@gmail.com>
 */
public class SimpleRemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        
        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();
        
        LightOnCommand lightOn = new LightOnCommand(light);
        GarageDoorUpCommand garageDoorOpen = new GarageDoorUpCommand(garageDoor);
        
        remote.setCommand(lightOn);
        remote.buttonWasPressed();
        remote.setCommand(garageDoorOpen);
        remote.buttonWasPressed();
    }
    
    public static void main1() {
        
    }
}
