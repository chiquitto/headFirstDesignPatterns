package RemoteControl2.Commands;

import RemoteControl2.Command;
import RemoteControl2.Receptors.Stereo;

/**
 *
 * @author Alisson Chiquitto <chiquitto@gmail.com>
 */
public class StereoOffCommand implements Command {

    Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
    }
}
