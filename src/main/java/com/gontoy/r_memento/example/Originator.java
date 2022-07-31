package com.gontoy.r_memento.example;

/**
 * @author gzw
 */
public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    // 得到备忘录对象
    public Memento saveStateMemento() {
        return new Memento(state);
    }

    // 恢复状态
    public void getStateMemento(Memento memento) {
        state = memento.getState();
    }
}
