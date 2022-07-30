package com.gontoy.l_template.example.simple;

/**
 * @author gzw
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("======== 制作红豆豆浆 ========");
        SoyaMilk readBeanSoyaMilk = new ReadBeanSoyaMilk();
        readBeanSoyaMilk.make();

        System.out.println("======== 制作红豆豆浆 ========");
        SoyaMilk peanutSoyaMilk = new PeanutSoyaMilk();
        peanutSoyaMilk.make();
    }
}
