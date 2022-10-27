package com.gontoy.a_single.example;

public class SingleTest {
    public static void main(String[] args) {
        LazySingle lazySingle1 = LazySingle.getInstance();
        LazySingle lazySingle2 = LazySingle.getInstance();
        System.out.println("Two LazySingle equal: " + (lazySingle1 == lazySingle2));

        HungrySingle hungrySingle1 = HungrySingle.getInstance();
        HungrySingle hungrySingle2 = HungrySingle.getInstance();
        System.out.println("Two HungrySingle equal: " + (hungrySingle1 == hungrySingle2));

        LazySingleForThread lazySingleForThread1 = LazySingleForThread.getInstance();
        LazySingleForThread lazySingleForThread2 = LazySingleForThread.getInstance();
        System.out.println("Two LazySingleForThread equal: " + (lazySingleForThread1 == lazySingleForThread2));

        StaticSingle staticSingle1 = StaticSingle.getInstance();
        StaticSingle staticSingle2 = StaticSingle.getInstance();
        System.out.println("Two StaticSingle equal: " + (staticSingle1 == staticSingle2));

        EnumSingle enumSingle1 = EnumSingle.INSTANCE;
        EnumSingle enumSingle2 = EnumSingle.INSTANCE;
        System.out.println("Two EnumSingle equal: " + (enumSingle1 == enumSingle2));
    }
}
