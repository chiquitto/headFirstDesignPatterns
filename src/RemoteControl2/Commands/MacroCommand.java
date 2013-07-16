package RemoteControl2.Commands;

import RemoteControl2.Command;

/**
 *
 * @author Alisson Chiquitto <chiquitto@gmail.com>
 */
public class MacroCommand implements Command {
    
    Command[] commands;

    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }
    
    @Override
    public void execute() {
        for (int i = 0; i < commands.length; i++) {
            commands[i].execute();
        }
    }

    @Override
    public void undo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
