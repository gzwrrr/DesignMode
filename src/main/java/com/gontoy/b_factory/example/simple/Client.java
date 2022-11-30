package com.gontoy.b_factory.example.simple;

public class Client {
    public static void main(String[] args) {
        Product product01 = SimpleFactory.createProduct(1);
        Product product02 = SimpleFactory.createProduct(2);
        Product product03 = SimpleFactory.createProduct(3);

        product01.run();
        product02.run();
        product03.run();
    }
}
