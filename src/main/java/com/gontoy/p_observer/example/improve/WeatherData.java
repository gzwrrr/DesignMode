package com.gontoy.p_observer.example.improve;

import java.util.ArrayList;

/**
 * @author gzw
 */
public class WeatherData implements Subject {
    /**
     * 温度、气压、湿度
     */
    private float temperature;
    private float pressure;
    private float humidity;

    private ArrayList<Observer> observers;


    public WeatherData() {
        this.observers = new ArrayList<Observer>();
    }


    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }


    /**
     * 当数据更新时就调用此防范
     * @param temperature
     * @param pressure
     * @param humidity
     */
    public void setData(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        // 将最新消息推送给接入方
        notifyObservers();
    }


    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    /**
     * 遍历所有的观察者并通知
     */
    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            observers.get(i).update(temperature, pressure, humidity);
        }
    }
}
