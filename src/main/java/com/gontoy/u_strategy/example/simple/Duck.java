package com.gontoy.u_strategy.example.simple;

/**
 * 传统的继承方案不好
 * @author gzw
 */
public abstract class Duck {
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
        System.out.println("鸭子飞");
    }
}
