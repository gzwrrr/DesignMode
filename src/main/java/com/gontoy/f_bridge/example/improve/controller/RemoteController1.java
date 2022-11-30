package com.gontoy.f_bridge.example.improve.controller;

import com.gontoy.f_bridge.example.improve.tv.TV;

public class RemoteController1 extends RemoteController {
    public RemoteController1(TV tv) {
        super(tv);
    }

    @Override
    public void on() {
        System.out.println("RemoteController1.on()");
        tv.on();
    }

    @Override
    public void off() {
        System.out.println("RemoteController1.off()");
        tv.off();
    }

    @Override
    public void tuneChannel() {
        System.out.println("RemoteController1.tuneChannel()");
        tv.tuneChannel();
    }
}
