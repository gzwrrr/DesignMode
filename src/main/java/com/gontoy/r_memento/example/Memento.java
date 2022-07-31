package com.gontoy.r_memento.example;

/**
 * @author gzw
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
