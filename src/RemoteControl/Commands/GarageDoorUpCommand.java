package RemoteControl.Commands;

import RemoteControl.Command;
import RemoteControl.Receptors.GarageDoor;

/**
 *
 * @author Alisson Chiquitto <chiquitto@gmail.com>
 */
public class GarageDoorUpCommand implements Command{
    
    GarageDoor garageDoor;

    public GarageDoorUpCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }
    
    @Override
    public void execute() {
        garageDoor.up();
    }
    
}
