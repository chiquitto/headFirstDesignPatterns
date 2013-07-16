package RemoteControl2.Commands;

import RemoteControl2.Command;
import RemoteControl2.Receptors.Hottub;

/**
 *
 * @author Alisson Chiquitto <chiquitto@gmail.com>
 */
public class HottubOffCommand implements Command {

    Hottub hottub;

    public HottubOffCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    @Override
    public void execute() {
        hottub.off();
    }

    @Override
    public void undo() {
        hottub.on();
    }
}
