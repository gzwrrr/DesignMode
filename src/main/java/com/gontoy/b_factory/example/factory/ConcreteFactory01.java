package com.gontoy.b_factory.example.factory;

import com.gontoy.b_factory.example.simple.ConcreteProduct01;
import com.gontoy.b_factory.example.simple.Product;

public class ConcreteFactory01 extends Factory {
    @Override
    public Product factoryMethod() {
        return new ConcreteProduct01();
    }
}
