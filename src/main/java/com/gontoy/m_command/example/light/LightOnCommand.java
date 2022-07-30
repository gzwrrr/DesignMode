package com.gontoy.m_command.example.light;

import com.gontoy.m_command.example.Command;

/**
 * 电灯开关命令
 * 需要聚合命令的接收者
 * @author gzw
 */
public class LightOnCommand implements Command {

    LightReceiver lightReceiver;

    public LightOnCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    public void execute() {
        lightReceiver.on();
    }

    public void undo() {
        lightReceiver.off();
    }
}
