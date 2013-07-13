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
        CeilingFan ceilingFan = new CeilingFan("Sala de estar");

        // luzes
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        
        // ventilador
        CeilingFanHighCommand livingCeilingFanHigh =
                new CeilingFanHighCommand(ceilingFan);
        CeilingFanMediumCommand livingCeilingFanMedium =
                new CeilingFanMediumCommand(ceilingFan);
        CeilingFanLowCommand livingCeilingFanLow =
                new CeilingFanLowCommand(ceilingFan);
        CeilingFanOffCommand livingCeilingFanOff =
                new CeilingFanOffCommand(ceilingFan);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, livingCeilingFanMedium, livingCeilingFanOff);
        remoteControl.setCommand(2, livingCeilingFanHigh, livingCeilingFanOff);

        System.out.println(remoteControl);

        for (int i = 0; i <= 2; i++) {
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
