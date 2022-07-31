package com.gontoy.r_memento.example;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gzw
 */
public class Caretaker {
    private List<Memento> mementos = new ArrayList<Memento>();

    public void add(Memento memento) {
        mementos.add(memento);
    }

    public Memento getMemento(int index) {
        return mementos.get(index);
    }
}
