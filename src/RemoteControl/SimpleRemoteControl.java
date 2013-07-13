package RemoteControl;

import RemoteControl.Receptors.Light;

/**
 *
 * @author Alisson Chiquitto <chiquitto@gmail.com>
 */
public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() {
    }
    
    public void setCommand(Command command) {
        this.slot = command;
    }
    
    public void buttonWasPressed() {
        slot.execute();
    }
}
