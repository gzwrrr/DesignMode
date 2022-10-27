package com.gontoy.a_single.example;

/**
 * 当 Singleton 类被加载时，静态内部类 SingletonHolder 没有被加载进内存
 * 只有当调用 getUniqueInstance() 方法从而触发 SingletonHolder.INSTANCE 时 SingletonHolder 才会被加载
 * 此时初始化 INSTANCE 实例，并且 JVM 能确保 INSTANCE 只被实例化一次
 * 这种方式不仅具有延迟初始化的好处，而且由 JVM 提供了对线程安全的支持
 */
public class StaticSingle {
    /**
     * 注意构造器私有
     */
    private StaticSingle() {

    }

    /**
     * 静态内部类
     */
    private static class SingleHolder {
        private static final StaticSingle INSTANCE = new StaticSingle();
    }

    public static StaticSingle getInstance() {
        return SingleHolder.INSTANCE;
    }
}
