package com.gontoy.n_visitor.example;

import java.util.LinkedList;
import java.util.List;

/**
 * @author gzw
 */
public class ObjectStructure {
    private List<People> peoples = new LinkedList<People>();

    public void attach(People people) {
        peoples.add(people);
    }

    public void detach(People people) {
        peoples.remove(people);
    }

    public void display(Action action) {
        for (People people : peoples) {
            people.accept(action);
        }
    }
}
