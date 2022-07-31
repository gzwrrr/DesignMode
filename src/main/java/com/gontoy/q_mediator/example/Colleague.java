package com.gontoy.q_mediator.example;

/**
 * @author gzw
 */
public class Colleague {
    protected String name;
    private Mediator mediator;

    public Colleague(Mediator mediator, String name) {
        this.name = name;
        this.mediator = mediator;
    }

    protected Mediator getMediator() {
        return mediator;
    }
}
