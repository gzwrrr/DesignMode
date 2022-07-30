package com.gontoy.m_command.example.light;

/**
 * @author gzw
 */
public class LightReceiver {
    public void on() {
        System.out.println("接收命令：打开电灯");
    }

    public void off() {
        System.out.println("接收命令：电灯关闭");
    }
}
