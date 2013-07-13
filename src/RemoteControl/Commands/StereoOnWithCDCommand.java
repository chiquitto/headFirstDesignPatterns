/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package RemoteControl.Commands;

import RemoteControl.Command;
import RemoteControl.Receptors.Stereo;

/**
 *
 * @author Alisson Chiquitto <chiquitto@gmail.com>
 */
public class StereoOnWithCDCommand implements Command {
    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCd();
        stereo.setVolume(11);
    }
    
    
}
