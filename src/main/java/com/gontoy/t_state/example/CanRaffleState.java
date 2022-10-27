package com.gontoy.t_state.example;

import java.util.Random;

/**
 * 可以抽奖的状态
 * @author gzw
 */
public class CanRaffleState implements State {
    RaffleActivity activity;

    public CanRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }


    @Override
    public void deductMoney() {
        System.out.println("已经扣过积分了");
    }

    @Override
    public boolean raffle() {
        System.out.println("正在抽奖，稍等...");
        Random random = new Random();
        int num = random.nextInt(10);
        if (num == 0) {
            activity.setState(activity.getDispenseState());
            System.out.println("恭喜抽中奖品了");
            return true;
        } else {
            System.out.println("很遗憾没有抽中奖品");
            activity.setState(activity.getNoRaffleState());
            return false;
        }
    }

    @Override
    public void dispensePrize() {
        System.out.println("没中奖，不能发放奖品");
    }
}
