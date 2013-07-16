package RemoteControl2.Commands;

import RemoteControl2.Command;
import RemoteControl2.Receptors.Hottub;

/**
 *
 * @author Alisson Chiquitto <chiquitto@gmail.com>
 */
public class HottubOnCommand implements Command {

    Hottub hottub;

    public HottubOnCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    @Override
    public void execute() {
        hottub.on();
    }

    @Override
    public void undo() {
        hottub.off();
    }
}
