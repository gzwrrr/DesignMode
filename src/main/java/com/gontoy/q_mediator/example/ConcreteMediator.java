package com.gontoy.q_mediator.example;

import java.util.HashMap;

/**
 * @author gzw
 */
public class ConcreteMediator extends Mediator {
    /**
     * 存放同事集合
     */
    private HashMap<String, Colleague> colleagueHashMap;
    private HashMap<String, String> interMap;

    public ConcreteMediator() {
        this.colleagueHashMap = new HashMap<String, Colleague>();
        this.interMap = new HashMap<String, String>();
    }

    /**
     * 注册同事
     * @param colleagueName
     * @param colleague
     */
    @Override
    public void register(String colleagueName, Colleague colleague) {
        colleagueHashMap.put(colleagueName, colleague);
        if (colleague instanceof Alarm) {
            interMap.put("Alarm", colleagueName);
        }
    }

    /**
     * 根据得到的消息，完成相应的任务
     * 中介者在这里协调各个同事对象并完成任务
     * @param stateChange
     * @param colleagueName
     */
    @Override
    public void getMessage(int stateChange, String colleagueName) {
        if (colleagueHashMap.get(colleagueName) instanceof Alarm) {
            if (stateChange == 0) {
                System.out.println("协调其他同事并完成任务...");
            }
        }
    }

    @Override
    public void sendMessage() {

    }
}
