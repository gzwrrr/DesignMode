package com.gontoy.n_visitor.example;

/**
 * @author gzw
 */
public class Woman extends People {

    @Override
    public void accept(Action action) {
        action.getWomanResult(this);
    }
}
