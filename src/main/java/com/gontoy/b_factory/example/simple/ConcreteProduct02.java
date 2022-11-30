package com.gontoy.b_factory.example.simple;

/**
 * @author gzw
 */
public class ConcreteProduct02 implements Product {

    @Override
    public void run() {
        System.out.println(ConcreteProduct02.class.getName());
    }
}
