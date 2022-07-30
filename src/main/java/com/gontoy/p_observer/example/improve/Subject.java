package com.gontoy.p_observer.example.improve;

/**
 * @author gzw
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
