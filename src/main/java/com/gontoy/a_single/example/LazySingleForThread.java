package com.gontoy.a_single.example;

/**
 * 懒汉式单例模式
 * 解决线程不安全的问题
 * 两种实现方式：
 * 1.直接加锁：会让线程阻塞过长时间，导致性能下降，不推荐使用
 * 2.双重校验锁：锁的粒度减小了，推荐使用
 *
 * @author gzw
 */
public class LazySingleForThread {
    /**
     * 注意要加上 volatile 关键字，这点非常重要！！！
     * 不加无法避免指令重排！
     * 实例化的过程分为三步：
     * 1.分配内存
     * 2.初始化变量
     * 3.变量指向初始化的内存地址
     * 如果发生了指令重排导致 2、3 步的顺序调换，就有可能出现一个线程先执行 3，此时变量直接指向了分配的内存地址不为 null
     * 而另一个线程可能恰巧发现不为空就直接返回了，这样就可能导致返回了空对象
     */
    private volatile static LazySingleForThread uniqueInstance;

    /**
     * 注意构造函数私有
     */
    private LazySingleForThread() {

    }

//    /**
//     * 直接加同步锁的方式
//     * @return LazySingleForThread
//     */
//    public static synchronized LazySingleForThread getInstance() {
//        if (uniqueInstance == null) {
//            uniqueInstance = new LazySingleForThread();
//        }
//        return uniqueInstance;
//    }

    /**
     * 双重校验锁的方式
     * 减小锁粒度
     * @return LazySingleForThread
     */
    public static LazySingleForThread getInstance() {
        // 这个 if 是防止初始化后还加锁
        if (uniqueInstance == null) {
            synchronized (LazySingleForThread.class) {
                // 这个 if 是防止多次初始化的
                if (uniqueInstance == null) {
                    uniqueInstance = new LazySingleForThread();
                }
            }
        }
        return uniqueInstance;
    }

}
