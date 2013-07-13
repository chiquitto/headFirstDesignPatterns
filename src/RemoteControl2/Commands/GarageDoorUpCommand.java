package RemoteControl2.Commands;

import RemoteControl2.Command;
import RemoteControl2.Receptors.GarageDoor;

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
