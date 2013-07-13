package RemoteControl.Commands;

import RemoteControl.Command;
import RemoteControl.Receptors.GarageDoor;

/**
 *
 * @author Alisson Chiquitto <chiquitto@gmail.com>
 */
public class GarageDoorDownCommand implements Command{
    
    GarageDoor garageDoor;

    public GarageDoorDownCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }
    
    @Override
    public void execute() {
        garageDoor.down();
    }
    
}
