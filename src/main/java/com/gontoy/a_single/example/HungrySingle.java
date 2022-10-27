package com.gontoy.a_single.example;

/**
 * 饿汉式单例模式
 * 线程安全
 * 但是损失一定的性能，即丢失了懒汉式延迟实例化的节约资源的好处
 */
public class HungrySingle {

    /**
     * 实例对象
     * 这里直接实例化就不会有个线程不安全的问题
     */
    private static HungrySingle uniqueInstance = new HungrySingle();

    /**
     * 注意构造器要私有
     */
    private HungrySingle() {
    }

    public static HungrySingle getInstance() {
        return uniqueInstance;
    }
}
