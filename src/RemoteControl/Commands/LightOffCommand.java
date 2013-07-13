package RemoteControl.Commands;

import RemoteControl.Command;
import RemoteControl.Receptors.Light;

/**
 *
 * @author Alisson Chiquitto <chiquitto@gmail.com>
 */
public class LightOffCommand implements Command {

    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
