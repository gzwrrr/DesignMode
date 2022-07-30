package com.gontoy.n_visitor.example;

/**
 * @author gzw
 */
public class Fail extends Action {

    @Override
    public void getManResult(Man man) {
        System.out.println("man 的评价是不好");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("woman 的评价是不好");
    }
}
