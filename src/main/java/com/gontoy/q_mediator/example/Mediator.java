package com.gontoy.q_mediator.example;

/**
 * @author gzw
 */
public abstract class Mediator {
    public abstract void register(String colleagueName, Colleague colleague);

    public abstract void getMessage(int stateChange, String colleagueName);

    public abstract void sendMessage();
}
