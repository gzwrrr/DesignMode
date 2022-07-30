package com.gontoy.l_template.example.simple;

/**
 * @desc 豆浆制作
 * @author gzw
 */
public abstract class SoyaMilk {
    /**
     * 制作豆浆的方法
     * 使用 final 不让子类覆盖
     */
    final void make() {
        select();
        addCondiments();
        soak();
        beat();
    }

    /**
     * 选材料
     */
    void select() {
        System.out.println("no.1 选择好的新鲜黄豆");
    }

    /**
     * 添加不同的配料
     * 抽象方法给子类具体实现
     */
    abstract void addCondiments();

    /**
     * 浸泡黄豆
     */
    void soak() {
        System.out.println("no.3 黄豆和配料浸泡");
    }

    /**
     * 打磨
     */
    void beat() {
        System.out.println("no.4 黄豆和配料打磨");
    }


}