package com.gontoy.t_state.example;

/**
 * @author gzw
 */
public interface State {
    /**
     * 扣除积分
     */
    void deductMoney();

    /**
     * 是否抽中奖品
     * @return
     */
    boolean raffle();

    /**
     * 发放奖品
     */
    void dispensePrize();
}
