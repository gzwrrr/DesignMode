package com.gontoy.f_bridge.example.improve;

import com.gontoy.f_bridge.example.improve.controller.RemoteController;
import com.gontoy.f_bridge.example.improve.controller.RemoteController1;
import com.gontoy.f_bridge.example.improve.controller.RemoteController2;
import com.gontoy.f_bridge.example.improve.tv.RCA;
import com.gontoy.f_bridge.example.improve.tv.Sony;

public class Client {
    public static void main(String[] args) {
        RemoteController remoteControl1 = new RemoteController1(new RCA());
        remoteControl1.on();
        remoteControl1.off();
        remoteControl1.tuneChannel();

        System.out.println("\n=======================\n");

        RemoteController remoteControl2 = new RemoteController2(new Sony());
        remoteControl2.on();
        remoteControl2.off();
        remoteControl2.tuneChannel();
    }
}
