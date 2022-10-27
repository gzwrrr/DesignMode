package com.gontoy.u_strategy.example.improve;

/**
 * @author gzw
 */
public class Client {
    public static void main(String[] args) {
        WildDuck wildDuck = new WildDuck();
        wildDuck.fly();

        ToyDuck toyDuck = new ToyDuck();
        toyDuck.fly();
    }
}
