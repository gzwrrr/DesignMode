package com.gontoy.t_state.example;

/**
 * 不能抽奖的状态
 * @author gzw
 */
public class NoRaffleState implements State {

    RaffleActivity activity;

    public NoRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    /**
     * 当前状态可以扣积分，扣除后将状态设置成可以抽奖的状态
     */
    @Override
    public void deductMoney() {
        System.out.println("扣除积分，您可以开始抽奖了");
        activity.setState(activity.getCanRaffleState());
    }

    /**
     * 当前状态不能抽奖
     * @return
     */
    @Override
    public boolean raffle() {
        System.out.println("扣除了积分才能抽奖");
        return false;
    }

    /**
     * 当前状态不能发放奖品
     */
    @Override
    public void dispensePrize() {
        System.out.println("当前不能发放奖品");
    }
}
