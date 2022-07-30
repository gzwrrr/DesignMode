package com.gontoy.n_visitor.example;

/**
 * @author gzw
 */
public abstract class People {
    /**
     * 提供一个方法让访问者可以访问
     * @param action 具体的操作
     */
    public abstract void accept(Action action);
}
