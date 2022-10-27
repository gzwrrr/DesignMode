package com.gontoy.u_strategy.example.improve;

/**
 * 传统的继承方案不好
 * @author gzw
 */
public abstract class Duck {
    FlyBehavior flyBehavior;


    public Duck() {

    }

    public abstract void display();

    public void quack() {
        System.out.println("鸭叫");
    }

    public void swim() {
        System.out.println("鸭游泳");
    }

    public void fly() {
        if (flyBehavior != null) {
            flyBehavior.fly();
        }
    }
}
