package RemoteControl2.Commands;

import RemoteControl2.Command;
import RemoteControl2.Receptors.Stereo;

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
