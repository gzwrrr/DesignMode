package com.gontoy.a_single.example;

/**
 * 懒汉式单例模式
 * 第一次获取时才创建
 * 之后获取都返回之前创建的
 * 这是线程不安全的
 * @author gzw
 */
public class LazySingle {
    /**
     * 实例对象
     */
    private static LazySingle uniqueInstance;

    /**
     * 注意构造器要私有
     */
    private LazySingle() {
    }

    public static LazySingle getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new LazySingle();
        }
        return uniqueInstance;
    }
}
