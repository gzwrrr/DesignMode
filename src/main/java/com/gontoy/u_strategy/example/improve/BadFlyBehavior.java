package com.gontoy.u_strategy.example.improve;

/**
 * @author gzw
 */
public class BadFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("不会飞翔");
    }
}
