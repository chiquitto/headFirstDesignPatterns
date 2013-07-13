package RemoteControl.Commands;

import RemoteControl.Command;
import RemoteControl.Receptors.CeilingFan;

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
