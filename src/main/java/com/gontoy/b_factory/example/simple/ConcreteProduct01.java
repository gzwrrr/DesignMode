package com.gontoy.b_factory.example.simple;

/**
 * @author gzw
 */
public class ConcreteProduct01 implements Product {

    @Override
    public void run() {
        System.out.println(ConcreteProduct01.class.getName());
    }
}
