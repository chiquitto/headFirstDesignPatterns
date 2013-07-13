package RemoteControl2.Commands;

import RemoteControl2.Command;
import RemoteControl2.Receptors.CeilingFan;

/**
 *
 * @author Alisson Chiquitto <chiquitto@gmail.com>
 */
public class CeilingFanOffCommand implements Command {
    
    CeilingFan ceilingFan;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.off();
    }
    
}
