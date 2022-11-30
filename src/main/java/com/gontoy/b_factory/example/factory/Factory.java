package com.gontoy.b_factory.example.factory;

import com.gontoy.b_factory.example.simple.Product;

/**
 * 将对象的实例化延迟到子类执行
 * @author gzw
 */
public abstract class Factory {
    abstract public Product factoryMethod();
    public void doSomething() {
        Product product = factoryMethod();
        // do something with the product
    }
}
