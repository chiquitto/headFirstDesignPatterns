package RemoteControl.Commands;

import RemoteControl.Command;
import RemoteControl.Receptors.Light;

/**
 *
 * @author Alisson Chiquitto <chiquitto@gmail.com>
 */
public class LightOnCommand implements Command {
    
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
    
}
