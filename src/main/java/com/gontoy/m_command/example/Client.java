package com.gontoy.m_command.example;

import com.gontoy.m_command.example.light.LightOffCommand;
import com.gontoy.m_command.example.light.LightOnCommand;
import com.gontoy.m_command.example.light.LightReceiver;

/**
 * 命令发布者
 * @author gzw
 */
public class Client {
    public static void main(String[] args) {
        // 电灯命令的接收者
        LightReceiver lightReceiver = new LightReceiver();
        // 电灯的打开命令
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        // 电灯的关闭命令
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);

        // 遥控器，此时还没有命令
        RemoteController remoteController = new RemoteController(10);

        // 设置命令
        remoteController.setOnCommand(0, lightOnCommand, lightOffCommand);

        System.out.println("=============== 打开电灯 ===============");
        remoteController.onButtonWasPushed(0);

        System.out.println("=============== 撤销 ===============");
        remoteController.undoButtonWasPushed();

        System.out.println("=============== 关闭电灯 ===============");
        remoteController.offButtonWasPushed(0);

        System.out.println("=============== 撤销 ===============");
        remoteController.undoButtonWasPushed();
    }
}
