package com.gontoy.q_mediator.example;

/**
 * @author gzw
 */
public class Client {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        Alarm alarm = new Alarm(mediator, "闹钟");

        alarm.sendAlarm(0);

    }
}
