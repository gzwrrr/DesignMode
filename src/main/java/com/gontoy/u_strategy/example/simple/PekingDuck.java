package com.gontoy.u_strategy.example.simple;

/**
 * @author gzw
 */
public class PekingDuck extends Duck {

    public PekingDuck() {
    }

    @Override
    public void display() {
        System.out.println("这是 Peking 鸭");
    }

    @Override
    public void fly() {
        System.out.println("Peking 鸭不能飞");
    }
}
