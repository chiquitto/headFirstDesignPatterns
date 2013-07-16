package RemoteControl2.Commands;

import RemoteControl2.Command;
import RemoteControl2.Receptors.Tv;

/**
 *
 * @author Alisson Chiquitto <chiquitto@gmail.com>
 */
public class TvOnCommand implements Command {

    Tv tv;

    public TvOnCommand(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.on();
    }

    @Override
    public void undo() {
        tv.off();
    }
}
