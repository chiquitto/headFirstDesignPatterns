package RemoteControl2;

import RemoteControl2.Commands.*;
import RemoteControl2.Receptors.*;

/**
 *
 * @author Alisson Chiquitto <chiquitto@gmail.com>
 */
public class RemoteControlTest {

    public static void main(String[] args) {
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        Light livingRoomLight = new Light("Sala de estar");

        // luzes
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);

        System.out.println(remoteControl);

        for (int i = 0; i <= 0; i++) {
            remoteControl.onButtonWasPushed(i);
            remoteControl.offButtonWasPushed(i);
            //System.out.println(remoteControl);
            remoteControl.undoButtonWasPushed(i);
            System.out.println("");
            
            remoteControl.offButtonWasPushed(i);
            remoteControl.onButtonWasPushed(i);
            //System.out.println(remoteControl);
            remoteControl.undoButtonWasPushed(i);
            System.out.println("");
        }

    }
}
