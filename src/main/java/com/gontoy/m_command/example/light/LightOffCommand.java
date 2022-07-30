package com.gontoy.m_command.example.light;

import com.gontoy.m_command.example.Command;

/**
 * 电灯关闭命令
 * 需要聚合命令接收者
 * @author gzw
 */
public class LightOffCommand implements Command {
    LightReceiver lightReceiver;

    public LightOffCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    public void execute() {
        lightReceiver.off();
    }

    public void undo() {
        lightReceiver.on();
    }

}
