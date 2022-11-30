package com.gontoy.b_factory.example.simple;

/**
 * @author gzw
 */
public class ConcreteProduct03 implements Product {

    @Override
    public void run() {
        System.out.println(ConcreteProduct03.class.getName());
    }
}
