package com.gontoy.t_state.example;

/**
 * @author gzw
 */
public class Client {
    public static void main(String[] args) {
        RaffleActivity activity = new RaffleActivity(1);
        for (int i = 0; i < 10; i++) {
            System.out.printf("=========== 第 %d 次抽奖 ===========\n", i + 1);
            activity.deductMoney();
            activity.raffle();
        }
    }
}
