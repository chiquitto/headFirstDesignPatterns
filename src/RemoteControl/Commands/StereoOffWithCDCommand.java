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
public class StereoOffWithCDCommand implements Command {
    Stereo stereo;

    public StereoOffWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }
    
    
}
