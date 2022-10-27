package com.gontoy.u_strategy.example.improve;

/**
 * @author gzw
 */
public class PekingDuck extends Duck {

    public PekingDuck() {
        flyBehavior = new BadFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println("这是 Peking 鸭");
    }
}
