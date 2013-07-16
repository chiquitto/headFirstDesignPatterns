/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package RemoteControl2;

import RemoteControl2.Commands.*;
import RemoteControl2.Receptors.*;

/**
 *
 * @author Alisson Chiquitto <chiquitto@gmail.com>
 */
public class RemoteControlPartyTest {
    public static void main(String[] args) {
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
        
        Light light = new Light("Sala de estar");
        Tv tv = new Tv("Sala de estar");
        Stereo stereo = new Stereo("Sala de estar");
        Hottub hottub = new Hottub("Sala de estar");
        
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        StereoOnCommand stereoOnCommand = new StereoOnCommand(stereo);
        TvOnCommand tvOnCommand = new TvOnCommand(tv);
        HottubOnCommand hottubOnCommand = new HottubOnCommand(hottub);
        
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);
        TvOffCommand tvOffCommand = new TvOffCommand(tv);
        HottubOffCommand hottubOffCommand = new HottubOffCommand(hottub);
        
        Command[] partyOn = {lightOnCommand, stereoOnCommand, tvOnCommand, hottubOnCommand};
        Command[] partyOff = {hottubOffCommand, tvOffCommand, stereoOffCommand, lightOffCommand};
        
        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);
        
        remoteControl.setCommand(0, partyOnMacro, partyOffMacro);
        
        System.out.println(remoteControl);
        System.out.println("--- Apertando MacroOn ---");
        remoteControl.onButtonWasPushed(0);
        System.out.println("--- Apertando MacroOff ---");
        remoteControl.offButtonWasPushed(0);
    }
}
