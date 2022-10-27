package com.gontoy.t_state.example;

/**
 * 奖品发放完毕
 * @author gzw
 */
public class DispenseOutState implements State {
    RaffleActivity activity;

    public DispenseOutState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("奖品已经发放完毕了，请下次再参与");
    }

    @Override
    public boolean raffle() {
        System.out.println("奖品已经发放完毕了，请下次再参与");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("奖品已经发放完毕了，请下次再参与");
    }
}
