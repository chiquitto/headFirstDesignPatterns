package RemoteControl.Commands;

import RemoteControl.Command;
import RemoteControl.Receptors.CeilingFan;

/**
 *
 * @author Alisson Chiquitto <chiquitto@gmail.com>
 */
public class CeilingFanOnCommand implements Command {
    
    CeilingFan ceilingFan;

    public CeilingFanOnCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.on();
    }
    
}
