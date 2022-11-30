package com.gontoy.b_factory.example.simple;

/**
 * 简单工厂
 * @author gzw
 */
public class SimpleFactory {
    public static Product createProduct(int type) {
        Product product = null;
        switch (type) {
            case 1:
                product = new ConcreteProduct01();
                break;
            case 2:
                product = new ConcreteProduct02();
                break;
            case 3:
                product = new ConcreteProduct03();
                break;
            default:
                product = null;
                break;
        }
        return product;
    }
}
