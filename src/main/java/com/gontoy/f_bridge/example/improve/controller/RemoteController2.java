package com.gontoy.f_bridge.example.improve.controller;

import com.gontoy.f_bridge.example.improve.tv.TV;

public class RemoteController2 extends RemoteController {
    public RemoteController2(TV tv) {
        super(tv);
    }

    @Override
    public void on() {
        System.out.println("RemoteController2.on()");
        tv.on();
    }

    @Override
    public void off() {
        System.out.println("RemoteController2.off()");
        tv.off();
    }

    @Override
    public void tuneChannel() {
        System.out.println("RemoteController2.tuneChannel()");
        tv.tuneChannel();
    }
}
