package com.gontoy.r_memento.example;

/**
 * @author gzw
 */
public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("state one: sleep");
        caretaker.add(originator.saveStateMemento());

        originator.setState("state two: walk");
        caretaker.add(originator.saveStateMemento());

        System.out.printf("当前状态：%s\n", originator.getState());

        originator.getStateMemento(caretaker.getMemento(0));
        System.out.printf("恢复后的状态：%s\n", originator.getState());
    }
}
