package RemoteControl2.Commands;

import RemoteControl2.Command;
import RemoteControl2.Receptors.Stereo;

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
