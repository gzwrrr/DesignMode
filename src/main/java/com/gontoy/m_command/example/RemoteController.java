package com.gontoy.m_command.example;

/**
 * 命令控制器，给命令发布者使用
 * @author gzw
 */
public class RemoteController {
    /**
     * 家居的开关命令
     * 因为有多个家居，即对应多个命令，所以使用数组
     * undoCommand 用于存储撤销对应的命令
     */
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteController(int length) {
        this.onCommands = new Command[length];
        this.offCommands = new Command[length];
        for (int i = 0; i < length; i++) {
            onCommands[i] = new EmptyCommand();
            offCommands[i] = new EmptyCommand();
        }
    }

    /**
     * 设置命令
     * @param index 第几个按钮（命令）
     * @param onCommand 具体的打开的命令
     * @param offCommand 具体的关闭的命令
     */
    public void setOnCommand(int index, Command onCommand, Command offCommand) {
        onCommands[index] = onCommand;
        offCommands[index] = offCommand;
    }

    /**
     * 按下打开的按钮
     * @param index 第几个按钮（命令）
     */
    public void onButtonWasPushed(int index) {
        onCommands[index].execute();
        // 设置执行撤销时对应的命令，即当前的命令
        undoCommand = onCommands[index];
    }

    /**
     * 按下关闭的按钮
     * @param index 第几个按钮（命令）
     */
    public void offButtonWasPushed(int index) {
        offCommands[index].execute();
        // 设置执行撤销时对应的命令，即当前的命令
        undoCommand = offCommands[index];
    }

    /**
     * 撤销命令
     */
    public void undoButtonWasPushed() {
        undoCommand.undo();
    }
}
