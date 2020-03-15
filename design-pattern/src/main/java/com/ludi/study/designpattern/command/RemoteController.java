package com.ludi.study.designpattern.command;

/**
 * @author 陆迪
 * @date 2020/3/15 22:40
 */
public class RemoteController {

    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;

    public RemoteController() {
        this.onCommands = new Command[5];
        this.offCommands = new Command[5];
        for (int i = 0; i < 5; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    public void setCommand(int no, Command onCommand, Command offCommand) {
        onCommands[no] = onCommand;
        offCommands[no] = offCommand;
    }

    public void onButtonPushed(int no) {
        onCommands[no].execute();
        undoCommand = offCommands[no];
    }

    public void offButtonPushed(int no) {
        offCommands[no].execute();
        undoCommand = offCommands[no];
    }

    public void undo() {
        undoCommand.execute();
    }
}
