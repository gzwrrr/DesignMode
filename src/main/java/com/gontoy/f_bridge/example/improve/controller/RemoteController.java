package com.gontoy.f_bridge.example.improve.controller;

import com.gontoy.f_bridge.example.improve.tv.TV;

public abstract class RemoteController {
    protected TV tv;

    public RemoteController(TV tv) {
        this.tv = tv;
    }

    public abstract void on();

    public abstract void off();

    public abstract void tuneChannel();
}
