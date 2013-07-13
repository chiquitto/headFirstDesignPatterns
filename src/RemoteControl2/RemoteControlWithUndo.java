package RemoteControl2;

import RemoteControl2.Commands.*;

/**
 *
 * @author Alisson Chiquitto <chiquitto@gmail.com>
 */
public class RemoteControlWithUndo {

    Command[] onCommands;
    Command[] offCommands;
    Command noCommand;
    Command undoCommand;

    public RemoteControlWithUndo() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        noCommand = new NoCommand();
        for (int i = 0; i < onCommands.length; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed(int slot) {
        undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n----- Remote Control -----\n");
        for (int i = 0; i < onCommands.length; i++) {
            if (onCommands[i] == noCommand) {
                break;
            }
            
            stringBuffer.append("[slot " + i + "]"
                    + onCommands[i].getClass().getSimpleName()
                    + "\t"
                    + offCommands[i].getClass().getSimpleName()
                    + "\n");
        }
        stringBuffer.append("[undo]" + undoCommand.getClass().getSimpleName());
        stringBuffer.append("\n----- Fim -----\n");
        return stringBuffer.toString();
    }
}
