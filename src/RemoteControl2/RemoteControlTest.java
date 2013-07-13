package RemoteControl2;

import RemoteControl2.Commands.*;
import RemoteControl2.Receptors.*;

/**
 *
 * @author Alisson Chiquitto <chiquitto@gmail.com>
 */
public class RemoteControlTest {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Sala de estar");
        Light kitchenLight = new Light("Luz da cozinha");
        CeilingFan ceilingFan = new CeilingFan("Sala de estar");
        GarageDoor garageDoor = new GarageDoor("");
        Stereo stereo = new Stereo("Sala de estar");

        // luzes
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        // ventilador
        CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        // porta da garagem
        GarageDoorUpCommand garageDoorUpCommand = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDownCommand = new GarageDoorDownCommand(garageDoor);

        // som
        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
        StereoOffWithCDCommand stereoOffWithCDCommand = new StereoOffWithCDCommand(stereo);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
        remoteControl.setCommand(3, stereoOnWithCDCommand, stereoOffWithCDCommand);

        System.out.println(remoteControl);

        for (int i = 0; i <= 3; i++) {
            remoteControl.onButtonWasPushed(i);
            remoteControl.offButtonWasPushed(i);
        }

    }
}
