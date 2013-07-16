package RemoteControl2.Commands;

import RemoteControl2.Command;
import RemoteControl2.Receptors.Tv;

/**
 *
 * @author Alisson Chiquitto <chiquitto@gmail.com>
 */
public class TvOffCommand implements Command {

    Tv tv;

    public TvOffCommand(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.off();
    }

    @Override
    public void undo() {
        tv.on();
    }
}
